package com.auribises.dao;

import java.util.ArrayList;

import org.bson.BsonObjectId;
import org.bson.Document;
import org.bson.types.ObjectId;

import com.auribses.model.Fever;
import com.auribses.model.User;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCursor;

// Mongo DB Code :)
public class DB {
	
	MongoClient mongoClient;

	public DB() {
		try {
			String connectionURL = "mongodb+srv://atpl:atpl@cluster0.eh8zx.gcp.mongodb.net/gw2021pj1?retryWrites=true&w=majority";
	    	mongoClient = MongoClients.create(connectionURL);
	    	
	    	System.out.println(getClass().getSimpleName()+" MongoDB Connection Created and Reference to Client Object Obtained");
	    	
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
	}
	
	// https://285c-124-253-46-77.ngrok.io/Session29/
	
	public boolean registerUser(User user) {
		
		Document document = new Document(user.toMap());
    	
    	//Insert into DataBase
    	mongoClient.getDatabase("gw2021pj1").getCollection("users").insertOne(document);
    	System.out.println(user.getName()+" Regsitere in MongoDB :)");
		
		return true;
	}
	
	public boolean logFever(Fever fever) {
		
		Document document = new Document(fever.toMap());
    	
    	//Insert into DataBase
    	mongoClient.getDatabase("gw2021pj1").getCollection("fevers").insertOne(document);
    	System.out.println(fever.userId+" "+fever.fever+" Fever Saved in MongoDB");
		
		return true;
	}
	
	public boolean loginUser(User user) {
		
		System.out.println("[DB] User Data:"+user);
		
		BasicDBObject query = new BasicDBObject();
		query.put("email", user.email);
		query.put("password", user.password);
		
    	// Fetching the Data
    	MongoCursor<Document> cursor = mongoClient.getDatabase("gw2021pj1").getCollection("users").find(query).iterator();
    	
    	
    	
    	//while(cursor.hasNext()) {
    	//	System.out.println(cursor.next().toJson());
    	//}
		
		
    	boolean flag = cursor.hasNext();
    	if(flag) {
    		//System.out.println(cursor.next().toJson());
    		Document document = cursor.next();
    		System.out.println(document.getObjectId("_id"));
    		System.out.println(document.getString("name"));
    		
    		user._id = document.getObjectId("_id").toString();
    		user.name = document.getString("name");
    		
    		System.out.println("[DB] User Data After Successful Login:"+user);
    		
    	}
		
		return flag;
	}
	
	public void updateFever(double fever, String feverId) {
			
		BasicDBObject query = new BasicDBObject();
		query.put("feverId", feverId);
		
    	MongoCursor<Document> cursor = mongoClient.getDatabase("gw2021pj1").getCollection("fevers").find(query).iterator();
    	Document document = cursor.next();
    	
    	document.put("fever", fever);
    	
    	//Update into DataBase
    	mongoClient.getDatabase("gw2021pj1").getCollection("fevers").updateOne(query, document);
    	System.out.println("Fever Updated");
		
	}
	
	public void deleteFever(String feverId) {
		
		System.out.println("[DB] Deleting Fever:"+feverId);
		
		BasicDBObject query = new BasicDBObject();
		
		query.put("_id", new ObjectId(feverId));
		
    	// Fetching the Data
    	mongoClient.getDatabase("gw2021pj1").getCollection("fevers").deleteOne(query);
    	
	}
	
	
	public void fetchUsers() {
		
		try {
			MongoCursor<Document> cursor = mongoClient.getDatabase("gw2021pj1").getCollection("admin").find().iterator();
	    	while(cursor.hasNext()) {
	    		//System.out.println(cursor.next());
	    		System.out.println(cursor.next().toJson());
	    	}
		}catch(Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
    	
	}
	
	public ArrayList<Fever> fetchFevers(String userId) {
		
		ArrayList<Fever> feverRecords = new ArrayList<Fever>();
		
		try {
			
			BasicDBObject query = new BasicDBObject();
			query.put("userId", userId);
			
	    	MongoCursor<Document> cursor = mongoClient.getDatabase("gw2021pj1").getCollection("fevers").find(query).iterator();
	    	while(cursor.hasNext()) {
	    		
	    		Document document = cursor.next();
	    		Fever fever = new Fever();
	    		fever._id = document.getObjectId("_id").toString();
	    		fever.userId = document.getString("userId");
	    		fever.dateTimeStamp = document.getDate("dateTimeStamp").toString();
	    		fever.fever = document.getDouble("fever");
	    		
	    		feverRecords.add(fever);
	    		
	    	}
		}catch(Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
		return feverRecords;
    	
	}
	
	
	
}



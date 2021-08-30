package com.auribises.dao;

import org.bson.Document;

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
	
	public boolean loginUser(User user) {
		
		BasicDBObject query = new BasicDBObject();
		query.put("email", user.email);
		query.put("password", user.password);
		
    	// Fetching the Data
    	MongoCursor<Document> cursor = mongoClient.getDatabase("gw2021pj1").getCollection("users").find(query).iterator();
    	
    	
    	
    	//while(cursor.hasNext()) {
    	//	System.out.println(cursor.next().toJson());
    	//}
		
		
    	boolean flag = cursor.hasNext();
    	if(flag)
    		System.out.println(cursor.next().toJson());
		
		return flag;
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
	
}



package com.auribises.dao;

import org.bson.Document;

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
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
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



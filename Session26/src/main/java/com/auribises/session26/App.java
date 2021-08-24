package com.auribises.session26;

import org.bson.Document;

import com.auribises.model.Student;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCursor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	Student student1 = new Student(2, "Fionna", "fionna@example.com", 21);
    	//System.out.println(student1);
    	System.out.println(student1.toMap());
    	
    	String connectionURL = "mongodb+srv://atpl:atpl@cluster0.eh8zx.gcp.mongodb.net/gw2021pj1?retryWrites=true&w=majority";
    	MongoClient mongoClient = MongoClients.create(connectionURL);
    	
    	System.out.println("Connection to Mongo DB Created :)");
    	
    	// MongoDB Document which converts HashMap to Document | BOXING
    	//Document document = new Document(student1.toMap());
    	
    	// Insert into DataBase
    	//mongoClient.getDatabase("gw2021pj1").getCollection("students").insertOne(document);
    	//System.out.println("Document Inserted :)");
    	
    	
    	// Fetching the Data
    	MongoCursor<Document> cursor = mongoClient.getDatabase("gw2021pj1").getCollection("students").find().iterator();
    	while(cursor.hasNext()) {
    		//System.out.println(cursor.next());
    		System.out.println(cursor.next().toJson());
    	}
    	
    	
    }
}

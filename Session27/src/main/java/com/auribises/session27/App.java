package com.auribises.session27;

import java.io.FileInputStream;
import java.util.List;

import com.auribises.model.Student;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.storage.Bucket;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.cloud.StorageClient;

/**
 * Firestore DataBase
 * Use to Save Data: https://firebase.google.com/docs/firestore/quickstart
 *
 */
public class App {
    public static void main( String[] args ){
        
    	String pathToServiceAccountKey = "/Users/ishantkumar/Downloads/GW2021JE1/Session27/src/main/java/serviceAccount.json";

    	try {
    		
    		FileInputStream serviceAccount = new FileInputStream(pathToServiceAccountKey);
    		
    		FirebaseOptions options = new FirebaseOptions.Builder()
    		  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
    		  .build();
    		
    		FirebaseApp.initializeApp(options);
    			
    		System.out.println("Firebase Initialized");
    		
    		Firestore db = FirestoreClient.getFirestore();
    		
    		Student student = new Student(4, "Leo", "leo@example.com", 22);

			
    		// Insert/Update
    		//DocumentReference docRef = db.collection("students-java").document(String.valueOf(student.roll));
    		DocumentReference docRef = db.collection("students-java").document(student.email);
    		// Add/Update
//    		ApiFuture<WriteResult> result = docRef.set(student.toMap());
//    		System.out.println("Result:"+result.get().getUpdateTime());
//    		System.out.println("Document Added with Name:"+ student.email);
    		
    		// Delete
//    		ApiFuture<WriteResult> result = docRef.delete();
//    		System.out.println("Document Deleted");
//    		System.out.println("Result:"+result.get().getUpdateTime());
    		
    		
    		ApiFuture<QuerySnapshot> query = db.collection("students-java").get();

    		QuerySnapshot querySnapshot = query.get();
    		List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
    		
    		for (QueryDocumentSnapshot document : documents) {
    			  System.out.println("Student Document ID: " + document.getId());
    			  System.out.println(document.getData()); // HashMap
    		}
    		
    		
		} catch (Exception e) {
			System.out.println("Something Went Wrong:"+e);
		}
    	
		
    			
    }
}

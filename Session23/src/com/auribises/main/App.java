package com.auribises.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.auribises.io.FileIOoperations;
import com.auribises.model.Customer;

public class App {

	public static void main(String[] args) {
		
		
		FileIOoperations ioOperations = new FileIOoperations();
		
		Customer customer = new Customer("John", "9876512345", 98.1f, "12:00", "14:00");
		//Customer customer = new Customer("Fionna", "9090921212", 98.4f, "13:00", "13:30");
		//Customer customer = new Customer("Dave", "9019110121", 98.8f, "14:00", "19:30");
		
		
		//System.out.println(customer);
		//System.out.println(customer.toCSV());
		
		//String csvData = customer.toCSV();
		// Write the csvData in file :)
		
		
		//ioOperations.writeDataInFile("/Users/ishantkumar/Downloads/customers-19-8-21.csv", csvData);
		//ioOperations.writeDataInFileAgain("/Users/ishantkumar/Downloads/customers-19-8-21.csv", csvData);
		
		//String path = "/Users/ishantkumar/Downloads/customers-19-8-21.csv";
		//String path = "/Users/ishantkumar/Downloads/BookMyShowApp.java";
		//ioOperations.readDataFromFile(path);
		//ioOperations.readDataFromFileAgain(path);
		
		
		//Customer customer = new Customer("Dave", "9019110121", 98.8f, "14:00", "19:30");
		
		
		try {
			String path = "/Users/ishantkumar/Downloads/"+customer.name+".txt";
			File file = new File(path);
			
			/*FileOutputStream stream = new FileOutputStream(file);
			ObjectOutputStream objectStream = new ObjectOutputStream(stream); // IO Chaining
			
			// Serialization -> Save the state of an object from Memory(RAM) in file
			objectStream.writeObject(customer);
			objectStream.close();
			stream.close();
			System.out.println("Object Saved");*/
			
			// DeSerialization -> Construct the Object back in Memory(RAM) from the File
			FileInputStream stream = new FileInputStream(file);
			ObjectInputStream objectStream = new ObjectInputStream(stream);
			Customer cRef = (Customer)objectStream.readObject();
			System.out.println(cRef);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

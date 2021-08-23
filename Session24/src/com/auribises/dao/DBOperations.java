package com.auribises.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.auribises.model.Customer;

/*
 	
 	For Java App to Connect to DataBase MySQL
 	We need to follow a Procedure
 	
 	// Reference to Jar File: https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.26
 	
 	1. Load the Driver in our App
 		1.1 Download the MySQL Driver jar file
 		1.2 Link the Jar file in Your Project Structure
 		1.3 Use the API Class.forname() to load the Driver Class in the App
 	
 	2. Create Connection with DataBase
 		2.1 Information to Connect to DB
 		user = root
 		password = auribises
 		url = jdbc:mysql://localhost/gw2021pj1
 		
 		2.2 Use the API Connection and DriverManager to create Connection
 			APIs are from java.sql package
 			
 	3. Create SQL Statement and Execute it
 		3.1 TO create SQL Statement use API Statement
 	
 	4. Close the Conennction
 			
 */

public class DBOperations {
	
	Connection connection;
	Statement statement;
	
	public DBOperations() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loaded :)");
		} catch (Exception e) {
			System.out.println("Something Went Worng: "+e);
		}
	}
	
	public void createConnection() {
		try {
			String user = "root";
			String password = "auribises";
			String url = "jdbc:mysql://localhost/gw2021pj1";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection Created :)");
		} catch (Exception e) {
			System.out.println("Something Went Worng: "+e);
		}
	}
	
	public void insertCustomer(Customer customer) {
		try {
			
			statement = connection.createStatement();
			System.out.println("4.1 Statement Created :)");
			
			String sql = "insert into Customer values(null, '"+customer.name+"', '"+customer.phone+"', '"+customer.email+"', "+customer.temperature+", '"+customer.inTime+"', '"+customer.outTime+"')";
			
			// executeUpdate() -> insert, update and delete in DataBase
			// executeQuery() -> select data from DataBase
			int id = statement.executeUpdate(sql);
			System.out.println("4.2 "+customer.name+" inserted at id: "+id);
			
		} catch (Exception e) {
			System.out.println("Something Went Worng: "+e);
		}
	}
	
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println("4. Connection Closed :)");
		} catch (Exception e) {
			System.out.println("Something Went Worng: "+e);
		}
	}

}

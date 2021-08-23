package com.auribises.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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
 	
 	4. Close the Connection
 			
 */

public class DBOperations {
	
	Connection connection; // Interface
	Statement statement;   // Interface
	
	PreparedStatement preparedStatement; // Interface
	
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
			
			/*statement = connection.createStatement();
			System.out.println("4.1 Statement Created :)");
			
			String sql = "insert into Customer values(null, '"+customer.name+"', '"+customer.phone+"', '"+customer.email+"', "+customer.temperature+", '"+customer.inTime+"', '"+customer.outTime+"')";
			
			// executeUpdate() -> insert, update and delete in DataBase
			// executeQuery() -> select data from DataBase
			int rows = statement.executeUpdate(sql);
			if(rows>0) {
				System.out.println("4.2 "+customer.name+" inserted");
			}else {
				System.out.println("4.2 Insert Failed :(");
			}*/
			
			
			// Explore:
			// String Formatting in Java
			// i.e. how can we substitute data in Strings without concatenation
			
			String sql = "insert into Customer values(null, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			
			// Indexing of ? i.e. wild card starts from 1
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setString(3, customer.email);
			preparedStatement.setFloat(4, customer.temperature);
			preparedStatement.setString(5, customer.inTime);
			preparedStatement.setString(6, customer.outTime);
			
			
			int rows = preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("4.2 "+customer.name+" inserted");
			}else {
				System.out.println("4.2 Insert Failed :(");
			}
			
		} catch (Exception e) {
			System.out.println("Something Went Worng: "+e);
		}
	}
	
	public void updateCustomer(Customer customer) {
		try {
			
			
			String sql = "update Customer set name=?, phone=?, email=?, outTime=? where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			
			// Indexing of ? i.e. wild card starts from 1
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setString(3, customer.email);
			preparedStatement.setString(4, customer.outTime);
			preparedStatement.setInt(5, customer.id);
			
			
			int rows = preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("4.2 "+customer.name+" updated");
			}else {
				System.out.println("4.2 Update Failed :(");
			}
			
		} catch (Exception e) {
			System.out.println("Something Went Worng: "+e);
		}
	}

	
	public void deleteCustomer(int id) {
		try {
			
			
			String sql = "delete from Customer where id = "+id;
			//String sql = "delete from Customer where id = ?";
			//String sql = "delete from Customer where id = ? and phone = ?";
			//String sql = "delete from Customer where phone = ?";
			preparedStatement = connection.prepareStatement(sql);
			
			// Indexing of ? i.e. wild card starts from 1
			//preparedStatement.setInt(1, id);
			
			
			int rows = preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("4.2 Customer with ID "+id+" deleted");
			}else {
				System.out.println("4.2 Delete Failed :(");
			}
			
		} catch (Exception e) {
			System.out.println("Something Went Worng: "+e);
		}
	}
	
	
	public ArrayList<Customer> fetchCustomers() {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		try {
			
			//String sql = "select * from Customer";
			//String sql = "select name, phone from Customer";
			String sql = "select * from Customer where id = 1";
			//String sql = "select * from Customer where phone = 9899898981";
			//String sql = "select * from Customer where email = john@example.com and password = john123";
			
			preparedStatement = connection.prepareStatement(sql);
			
			// Fetched Data from Table is available in ResultSet
			ResultSet resultSet = preparedStatement.executeQuery();
			
			
			while(resultSet.next()) {
				
				Customer customer = new Customer();
				// Here resultset indexing i.e. columns in table starts from 1
				//customer.id = resultSet.getInt("id");
				customer.id = resultSet.getInt(1);
				customer.name = resultSet.getString(2);
				customer.phone = resultSet.getString(3);
				customer.email = resultSet.getString(4);
				customer.temperature = resultSet.getFloat(5);
				customer.inTime = resultSet.getString(6);
				customer.outTime = resultSet.getString(7);
				
//				System.out.println(customer);
//				System.out.println();
				
				customers.add(customer);
				
			}
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);
		}
		
		return customers;
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

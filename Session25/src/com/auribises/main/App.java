package com.auribises.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.auribises.dao.DBOperations;
import com.auribises.model.Customer;

// class App is known as the Main Class
// Driver Class :)
public class App {

	
	public static void main(String[] args) {
		
		Date date = new Date();
		//System.out.println(date);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateTime = formatter.format(date);
		
		//System.out.println(dateTime);
		
		// insert into Customer values(null, 'John', '9876512345', 'john@example.com', 98.4, '12:00', 'NA');
		// update Customer set name='John Watson', phone='9123411234' where id = 1;
		
		//Customer customer1 = new Customer(1, "John", "9876512345", "john@example.com", 98.4f, dateTime, "NA");
		//Customer customer1 = new Customer(0, "George", "9191903030", "george@example.com", 98.4f, dateTime, "NA");
		//Customer customer1 = new Customer(2, "George G", "8765498765", "george.g@example.com", 98.4f, dateTime, dateTime);
		
		//Customer customer1 = new Customer(0, "Lee", "765412345", "lee.watson@example.com", 98.4f, dateTime, "NA");
		//System.out.println(customer1);
		
		// 1. Load the Driver
		DBOperations db = new DBOperations();
		
		// 2. Create the Connection
		db.createConnection();
		
		// 3. Write and Execute SQL Statement
		//db.insertCustomer(customer1);
		//db.updateCustomer(customer1);
		
		//db.deleteCustomer(2);
		
		/*ArrayList<Customer> customers = db.fetchCustomers();
		
		customers.forEach((element)->{
			System.out.println(element);
		});*/
		
		db.fetchCustomers().forEach((element)->{
			System.out.println(element);
		});
		
		// 4. Close the Connection
		db.closeConnection();

	}

}

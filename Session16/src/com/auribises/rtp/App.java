package com.auribises.rtp;

import java.util.Scanner;

// Assignment -> Write the same program for Cab Booking Use Case

public class App {
	
	// Factory Design Pattern
	static Payment transact(String choice) {
		
		// RTP
		Payment payment = null;
		
		/*if(choice.equals("netbanking")) {
			payment = new NetBanking();
		}else if(choice.equals("upi")) {
			payment = new UPI();
		}else {
			System.out.println("Please Select a Valid Choice");
		}*/
		
		if(choice.contains("netbanking")) {
			payment = new NetBanking();
		}else if(choice.contains("upi")) {
			payment = new UPI();
		}else {
			System.out.println("Please Select a Valid Choice");
			//payment = new Payment(); -> error as Payment is abstract
		}
		
		return payment;
	}

	public static void main(String[] args) {
		
		//Payment payment = new Payment();
		//payment.pay(3000);
		
		//Payment payment;
		//payment = new Payment();
		//payment.pay(3000);
		
		//Payment payment;
		// Polymorphic Stament
		// Reference of Parent can refer to Child Object

		//payment = new NetBanking(); // NetBanking IS-A Payment
		//payment.pay(3000);
		
		//payment = new UPI();
		//payment.pay(3000);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hi! I am John");
		System.out.println("How would like to transact? ");
		String line = scanner.nextLine();
		
		/*if(line.contains("netbanking")) {
			
		}else if(line.contains("upi")) {
			
		}*/
		
		//Payment payment = App.transact("credit");
		Payment payment = App.transact(line);
		if(payment != null) {
			payment.pay(5000);
		}
		
		
	}

}

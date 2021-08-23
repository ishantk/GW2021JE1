package com.auribises.rtp;

/*public class Payment {
	
	String date;
	String time;
	String userId;
	int amount;
	
	Payment(){
		System.out.println("Payment Object Constructed");
	}
	
	void pay(int amount) {
		System.out.println("Paying \u20b9"+amount);
	}
}*/

abstract class Payment { // Payment cannot have direct objects
	// but RULE of Inheritance will remain intact
	
	String date;
	String time;
	String userId;
	int amount;
	
	Payment(){
		System.out.println("Payment Object Constructed");
	}
	
	/*void pay(int amount) {
		System.out.println("Paying \u20b9"+amount);
	}*/
	
	void show() { // concrete method
		System.out.println("========================");
		System.out.println("Welcome to Payments Page");
		System.out.println("========================");
	}
	
	
	// RULE created by Parent for Child
	// if we have n abstract methods in Parent, all children must define all th n methods
	abstract void pay(int amount); 
}

class NetBanking extends Payment{
	
	NetBanking(){
		System.out.println("NetBanking Object Constructed");
	}
	
	void inputUserNameAndPassword(String userName, String password) {
		System.out.println("Transacting for User "+userName);
	}
	
	void pay(int amount) {
		show();
		inputUserNameAndPassword("john.watson", "pass123");
		System.out.println("Paying By NetBanking \u20b9"+amount);
	}
	
}

class UPI extends Payment{
	
	UPI(){
		System.out.println("UPI Object Constructed");
	}
	
	void inputUPI(String upiId) {
		System.out.println("Transacting for UPI "+upiId);
	}
	
	void pay(int amount) {
		inputUPI("john.watson@paytm");
		System.out.println("Paying By UPI \u20b9"+amount);
	}
	
	
	void hello() {
		System.out.println("Hello from UPI");
	}
	
}

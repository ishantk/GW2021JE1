package com.auribises;

import java.io.IOException;

// USER DEFINED EXCEPTION
// MyBankingException IS A  RuntimeException | UNCHECKED
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
		
	}
}

//YourBankingException IS A  Exception | CHECKED
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
		
	}
}

class BankAccount{
	
	String name;
	int balance;
	int attempts;
	
	static int minBalance = 2000;
	
	BankAccount(String name){
		this.name = name;
		balance = 10000;
	}
	
	void withdraw(int amount) throws IOException, YourBankingException{
		
		balance -= amount;
		
		if(balance < minBalance) {
			attempts++;
			balance += amount;
			System.out.println("WITHDRAW *FAILED* "+name+"'s Balance is Low: \u20b9"+balance);
		}else {
			System.out.println("WITHDRAW SUCCESS. "+name+"'s New Balance is: \u20b9"+balance);
		}
		
		if(attempts == 3) {
			
			//throwing an UNCHECKED EXCEPTION
			//ArithmeticException ref = new ArithmeticException("Illegal Attempts");
			//throw ref;
			
			//throwing a CHECKED EXCEPTION
			//IOException ref = new IOException("Illegal Attempts");
			//throw ref;
			
			//MyBankingException exception = new MyBankingException("Illegal Attempts");
			
			YourBankingException exception = new YourBankingException("Illegal Attempts");
			throw exception;
		}
		
	}
	
	void show() {
		System.out.println(name+" has a balance of \u20b9"+balance);
	}
}


public class BankingApp {

	public static void main(String[] args) {
		
		System.out.println("Banking App Start");
		
		BankAccount account1 = new BankAccount("John");
		BankAccount account2 = new BankAccount("Fionna");
		
		account1.show();
		account2.show();
		
		//account1.withdraw(3000);
		
		try {
			for(int i=1;i<=500000;i++) {
				account2.withdraw(3000);
			}
		}catch(Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
		
		System.out.println("Banking App Finished");
	}

}

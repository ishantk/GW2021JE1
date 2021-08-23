package com.auribises.java8;

// MethodReference -> Monkey Patching

@FunctionalInterface
interface Payment{
	void pay(int amount);
}

public class MethodReferences {
	
	
	MethodReferences(){
		
	}
	
	MethodReferences(int amount){
		System.out.println("[CONSTRUCTOR] Transaction Done");
		System.out.println("Amount Received \u20b9"+amount);
	}
	
	static void transaction(int amount) {
		System.out.println("[TRASNACTION] Transaction Done");
		System.out.println("Amount Received \u20b9"+amount);
	}
	
	void payAmount(int amount) {
		System.out.println("[PAY AMOUNT] Transaction Done");
		System.out.println("Amount Received \u20b9"+amount);
	}

	public static void main(String[] args) {
		
		// 1. Method Reference -> Static Method
		Payment payment = MethodReferences::transaction;
		payment.pay(1000);

		
		// 2. Method Reference -> Non Static Method
		MethodReferences refVar = new MethodReferences();
		Payment paymentAgain = refVar::payAmount;
		paymentAgain.pay(2000);
		
		// 3. Method Reference -> Constructors
		Payment finalPayment = MethodReferences::new;
		finalPayment.pay(3000);
		
	}

}

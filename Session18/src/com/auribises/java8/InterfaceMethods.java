package com.auribises.java8;

interface Inf{
	
	int a = 10;
	
	void hello();
	
	static void fun() {
		System.out.println("This is fun from Inf");
	}
	
	default void bye() {
		System.out.println("This is bye from Inf");
	}
}



interface PayTMPayment{
	
	boolean BANK_AVAILABILITY = false;
	
	default void pay(int amount) {
		
		if(BANK_AVAILABILITY) {
			System.out.println("[PAYTM]");
			System.out.println("Transaction Done");
			onSuccess();
		}else {
			System.out.println("[PAYTM]");
			System.out.println("Transaction Failed");
			onFailure();
		}
		
	}
	
	void onSuccess();
	void onFailure();
}

interface GooglePay{
	
}

class ZomatoPayment implements PayTMPayment, GooglePay{
	@Override
	public void onSuccess() {
		System.out.println("[ZOMATO]");
		System.out.println("ORDER PLACED");
		System.out.println();
	}
	
	@Override
	public void onFailure() {
		System.out.println("[ZOMATO]");
		System.out.println("ORDER FAILED DUE TO PAYMENT");
		System.out.println("PLEASE RETRY");
		System.out.println();
	}
}

class CA implements Inf{
	
	public void hello() {
		System.out.println("This is hello implemented in CA");
	}
}

public class InterfaceMethods {

	public static void main(String[] args) {
		
		Inf iRef = new CA();
		
		System.out.println("a is:"+Inf.a);
		Inf.fun();
		//Inf.bye(); // error -> only accessible with Reference Variable Name 
		
		
		iRef.bye(); // OK
		iRef.hello();
		//iRef.fun(); // error  -> only accessible with Interface Name
		
		PayTMPayment payment = new ZomatoPayment();
		payment.pay(3000);
		
	}
	
	

}

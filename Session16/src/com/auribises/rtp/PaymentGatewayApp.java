package com.auribises.rtp;

abstract class RazorPayPaymentGateway{
	
	static boolean isBankAvailable = false;
	
	final void pay(int amount) {
		if(isBankAvailable) {
			System.out.println("Welcome to Razorpay");
			System.out.println("Transacting an Amount of \u20b9"+amount);
			System.out.println("Thank You");
			onSuccess("Payment Successfully Transacted");
		}else {
			onFailure("Payment Transaction Failed", 401);
		}
	}
	
	abstract void onSuccess(String message);
	abstract void onFailure(String message, int errorCode);
	
}


class ZomatoPaymentPage extends RazorPayPaymentGateway{
	
	
	void onSuccess(String message) {
		System.out.println("====ZOMATO=====");
		System.out.println(message);
		System.out.println("Your Order is Accepted :)");
	}
	
	void onFailure(String message, int errorCode) {
		
		System.out.println("====ZOMATO=====");
		
		System.out.println(message);
		if(errorCode == 401) {
			System.out.println("Bank UnAvailable");
			System.out.println("Please Try Again");
		}
		
		System.out.println("Order Not Accecpted :(");
	}
	
}

public class PaymentGatewayApp {

	public static void main(String[] args) {
		
		ZomatoPaymentPage pay = new ZomatoPaymentPage();
		pay.pay(1000);

	}

}

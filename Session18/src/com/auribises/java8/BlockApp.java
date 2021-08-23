package com.auribises.java8;

public class BlockApp {
	
	int a;
	static int b;
	
	BlockApp(){
		a = 10;
		System.out.println("BlockApp Default Constructor");
		b = 10; //-> not a good practice
	}
	
	// Initializer Block -> PreProcessing
	{
		a = 100;
		b = 100; //-> not a good practice
		System.out.println("Block App Block");
	}
	
	// Static Block -> Used to Initialize static variables of class :)
	// PreProcessing for our App i.e. something before the main
	static {
		b = 11;
		System.out.println("BlockApp Static Block");
	}
	
	void show() {
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
	}

	public static void main(String[] args) {
	
		System.out.println("Block App Started");
		
		BlockApp app1=null;
		BlockApp app2 = new BlockApp();
		
		//BlockApp.b = 1000;
		
		BlockApp app3 = new BlockApp();
		
		System.out.println("Block App Finished");
		
		//app1.show(); // ? error at run time -> NullPointerException
		app2.show();
		app3.show();
		
	}

}

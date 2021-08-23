package com.auribises.rtp;


// Interface as a Storage Container
// It will always have variables as final and static
interface Inf{
	
	int a = 10; // -> public static final int a = 10;
	
	static void show() {
		System.out.println("This is show in Inf");
		System.out.println("a is: "+a);
	}
}

class Impl implements Inf{
	
	
}

// Functional Interface -> Interface to have only 1 method

@FunctionalInterface 		// => Annotation
interface ActionListener{
	void onClick();
}

class Button implements ActionListener{
	
	public void onClick() {
		
	}
}

public class InterfacesAgain {

	public static void main(String[] args) {
		
		//Inf.a = 100; error
		System.out.println("a is:"+ Inf.a);
		
		Inf.show();
		
		// if a is not in Impl Class, It will look for it in its Interface
		System.out.println("a is: "+Impl.a);
		// Impl.show(); // error

		//Button button = new Button();
		//ActionListener listener = new Button();
		
		// Anonymous Class :) // Singleton Design Pattern
		ActionListener listener = new ActionListener() { // -> new ActionListener() { to create a class with no name
			
			public void onClick() {
				System.out.println("Button Clicked");
			}
		};
		
		listener.onClick();
		
	}

}

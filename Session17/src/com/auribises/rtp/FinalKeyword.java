package com.auribises.rtp;

final class A{
	final void show() {
		
	}
}

class B{ //extends A{
	/*void show() {
		
	}*/
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		int a = 10;
		a = 100;
		
		// final variable
		final int b = 10; // which cannot be modified
		//b = 100; // error
		
		final int c; // blank final variable
		c = 100;
		//c = 10000; error
		

	}

}

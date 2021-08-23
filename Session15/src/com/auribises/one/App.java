package com.auribises.one;

// main class
public class App {

	public static void main(String[] args) {
		
		One one = new One();
		Two two = new Two();
		
		// one.showPvt(); // error
		one.showDef();
		one.showProt();
		one.showPub();
		
		// two.showPvt(); // error
		two.showDef();
		two.showProt();
		two.showPub();
		

	}

}

// private: private is most secure. i.e. least accessible in the boundary of class/object
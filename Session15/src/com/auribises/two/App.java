package com.auribises.two;

//import com.auribises.one.One;
//import com.auribises.one.Two; // error

class One{
	void hello() {
		System.out.println("Hello");
	}
}

// Package Level Inheritance
class Three extends com.auribises.one.One{

	void show() {
		//showPvt(); // error
		//showDef(); // error
		showProt();  // ok and how exactly protected works
		//showPub(); // ok
	}
}

public class App {

	public static void main(String[] args) {
		
		com.auribises.one.One one = new com.auribises.one.One();
		//Two two = new Two();

		//one.showPvt(); // error
		//one.showDef(); // error
		//one.showProt(); // error
		one.showPub();
		
		System.out.println("THREE IN ACTION");
		
		Three three = new Three();
		//three.showProt(); // error
		three.show();
		
	}

}

// default: accessible only in package
// public: accessible everywhere
// protected: in the package and in the child outside the package

// Accessibility: private > default > protected > public

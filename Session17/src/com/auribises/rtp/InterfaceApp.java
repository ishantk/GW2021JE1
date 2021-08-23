package com.auribises.rtp;

//class CA{
/*abstract class CA{
	
	CA(){
		System.out.println("CA Object Constructed");
	}
	
	void show() {
		System.out.println("This is show of CA");
	}
}*/

// Pure Concept to perform Abstraction :)
interface CA{
	
	/*CA(){
		System.out.println("CA Object Constructed");
	}*/
	// cannot have objects
	// neither we nor Run Time Environment can create its objects
	
	// Methods in Interface are by default public abstract
	void show(); // -> public abstract void show();

}

//class CB implements CA -> This is not Parent Child Relationship
// We do not have Object to Object Inheritance here
class CB implements CA{ //extends CA{
	
	CB(){
		System.out.println("CB Object Constructed");
	}
	
	public void show() {
		System.out.println("This is show of CB");
	}
}

interface Inf1{
	void show();
	void fun();
}

interface Inf2{
	void show();
	void hello();
}

interface Inf3 extends Inf1, Inf2{
	
}

class CC implements Inf3{//Inf1, Inf2{
	
	public void fun() {
		System.out.println("fun of CC");
	}
	
	public void show() {
		System.out.println("show of CC");
	}
	
	public void hello() {
		System.out.println("hello of CC");
	}
	
	void bye() {
		System.out.println("bye of CC");
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		
		//CA ca = new CA(); it is allowed

		// Direct Object Construction
		//CB cb = new CB();
		
		// Polymorphic Statement
		// Earlier: Reference Variable of Parent can Refer to Child Object
		// Now: Reference Variable of Interface can Refer to the Object which implements it
		//CA ca = new CB();
		//ca.show();
		
		CC cc = new CC();
		cc.show();
		cc.hello();
		cc.bye();
		
		Inf1 i1 = new CC();
		i1.show();
		//i1.hello(); error
		//i1.bye();   error
		
		Inf2 i2 = new CC();
		i2.show();
		i2.hello();
		//i2.bye(); error
		
		// DownCasting
//		CC cRef = (CC)i2;
//		cRef.show();
//		cRef.hello();
//		cRef.bye();
		
		
		Inf3 i3 = new CC();
		i3.hello();
		i3.show();
		i3.fun();
		//i3.bye();
	}

}


class Parent{
	
	// Attributes: Property of Object 
	String fname;
	String lname;
	int wealth;
	
	// Property of Object
	Parent(){
		fname = "John";
		lname = "Watson";
		wealth = 100000;
		System.out.println("Parent Object Constructed");
	}
	
	Parent(String fname, String lname, int wealth){
		this.fname = "John";
		this.lname = "Watson";
		this.wealth = 100000;
		System.out.println("Parent Object Constructed");
	}
	
	// Property of Object
	void show() {
		System.out.println("[PARENT] "+fname+" "+lname+" "+wealth);
	}
	
}

// Inheritance
// relation development between 2 classes as Parent and Child

class Child extends Parent{
	
	String fname;
	int wealth;
	
	String companyName;
	
	Child(){
		// super(); is embedded automatically
		//super(); -> execution to create the Parent Object first and execute its constructor
		//super("John", "Watson", 100000);
		fname = "Fionna";
		wealth = 50000;
		companyName = "ABC Ltd";
		System.out.println("Child Object Constructed");
	}
	
	// Overriding
	void show() {
		super.show(); // super as reference variable
		System.out.println("[CHILD] "+fname+" "+lname+" "+wealth+" "+companyName);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		//Parent pRef = new Parent();
		
		// RULE# 1: Whenever we create the object of Child, 
		// Object of Parent is created before the object of child
		
		Child cRef = new Child(); // nothing in object
		
		// RULE# 2: Child can access property of Parent
		// iff it does not have it
		cRef.wealth -= 10000;
		cRef.show();
		
		// RULE# 3: Child will be able to access everything in Prarent
		// Other than private
		
	}

}

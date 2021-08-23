// Polymorphism
// Run Time Polymorphism -> Method Overriding

// private, default, protected, public

class ParentClass{
	
	void purchaseBike() {
		System.out.println("Lets Purchase Bajaj Pulsar");
	}
}

class ChildClass extends ParentClass{
	
	// Re Defining the Method of Parent in Child provided, Parent's Method is not private
	// Access of Method in Child must be higher or Same than Parent 
	void purchaseBike() {
		System.out.println("Lets Purchase Royal Enfield");
	}
	
}

public class MethodOveriding {

	public static void main(String[] args) {
		
		ChildClass cRef = new ChildClass();
		cRef.purchaseBike();

	}

}

class Maths{
	static void addNumbers1(int a, int b) {
		int c = a+b;
		System.out.println("Addition of "+a+" and "+b+" is: "+c);
	}
}


public class Methods {

	/*
	 	1. What is a Method ?
	 	Its a function inside the class
	 	It contains certain statements
	 	which will be executed in a sequence
	 	method can be executed again and again
	 	
	 	2. How to create it ?
	 	return_type name_of_method(inputs){
	 		// definition
	 	}
	 	
	 	3. How to execute it ?
	 	1. A method can be static -> execution by class
	 	2. A method can be non static -> execution by object
	 	
	 	4. Why to Use Method ?
	 	When we have a logic or code snippets which
	 	we repeatedly use in program, we wrap them in a method
	 */
	
	// static method
	// property of class
	static void addNumbers1(int a, int b) {
		int c = a+b;
		System.out.println("[addNumbers1] "+a+ " + "+b+" = "+c);
	}
	
	// non static method
	// Property of Object
	void addNumbers2(int a, int b) {
		int c = a+b;
		System.out.println("[addNumbers2] "+a+ " + "+b+" = "+c);
	}
	
	public static void main(String[] args) {
		
		/*int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(a+ " + "+b+" = "+c);
		
		a = 11;
		b = 22;
		c = a + b;
		System.out.println(a+ " + "+b+" = "+c);*/
		
		// static -> property of class
		// hence, static methods can be executed with class name
		Methods.addNumbers1(10, 20);
		addNumbers1(11, 22);
		addNumbers1(44, 55);
		
		Maths.addNumbers1(10, 20);
		
		Methods ref = new Methods();
		System.out.println(ref);
		ref.addNumbers2(30, 80);
		
	}

}

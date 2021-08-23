package com.auribises.java8;

class User{
	
	String name;
	String phone;
	String email;
	
	
	User(){
		this("john");
		phone = "NA";
		email = name+"@example.com";
		System.out.println("Default Constructor");
	}
	
	User(String name){
		//this();
		this.name = name;
		System.out.println("Parameterized Constructor1");
	}
	
	User(boolean upgradeToPrime){
		this();
		System.out.println("Parametrized Constructor2");
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
}

class A{
	
	A(){
		this(10);
		System.out.println("A Default");
	}
	
	A(int a){
		//this();
		System.out.println("A Parameterized "+a);
	}
	
}

class B extends A{
	B(){
		//super(10);
		System.out.println("B Default");
	}
}

class C extends B{
	C(){
		//super();
		System.out.println("C Default");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		
		//User user1 = new User("john");
		//System.out.println(user1);
		
		C c = new C();
		
	}

}

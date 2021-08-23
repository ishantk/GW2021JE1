/*
 	OOPS:
 		Encapsulation
 		Inheritance
 		Abstraction
 		Polymorphism
 */

// User: uid, name, phone
public class User {
	
	// Encapsulation -> 100% Security
	private String secretKey = "hello123";
	
	// Attributes: The are property of Object
	// Non Public or Package level Attribute
	int uid;
	// Data Hiding
	// Private Attributes
	// Abstraction -> Indirect Access
	private String name;
	private String phone;
	
	// Property of Object
	User(){
		uid = 0;
		name = "";
		phone = "";
		System.out.println("[DEFAULT CONSTRUCTOR]: Object Constructed with intiial values");
	}
	
	// Parmeterized Constructor
	User(int uid, String name, String phone) {
		this.uid = uid;
		this.name = name;
		this.phone = phone;
		System.out.println("[PARAMETERIZED CONSTRUCTOR]: Object Constructed with intiial values");
	}
	
	
	String getName() {
		return name;
	}

	void setName(String name) {
		if(name.isEmpty() || name.length() ==1) {
			System.err.println("Invalid Name.");
		}else {
			this.name = name;
		}
	}

	String getPhone() {
		return phone;
	}

	// To perform validation
	void setPhone(String phone) {
		if(phone.isEmpty()) {
			System.err.println("Please Enter Correct Phone");
		}else {
			if(phone.length() == 10) {
				Long.parseLong(phone);
				this.phone = phone;
			}else {
				System.err.println("Phone Number must be 10 digits");
			}
		}
		
	}

	// Property of Object
	void showUser() {
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println(uid+" | "+name+" | "+phone);
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
}

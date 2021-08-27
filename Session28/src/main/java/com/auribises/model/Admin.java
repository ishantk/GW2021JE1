package com.auribises.model;

public class Admin {
	
	//public String _id;
	public String email;
	public String password;
	
	public Admin() {
		
	}
	
	public Admin(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [email=" + email + ", password=" + password + "]";
	}
	

}

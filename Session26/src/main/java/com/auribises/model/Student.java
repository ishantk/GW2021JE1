package com.auribises.model;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	int roll;
	String name;
	String email;
	int age;
	
	public Student(){
		
	}
	
	public Student(int roll, String name, String email, int age) {
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	
	public Map<String, Object> toMap(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("roll", roll);
		map.put("name", name);
		map.put("email", email);
		map.put("age", age);
		return map;
	}
	

}

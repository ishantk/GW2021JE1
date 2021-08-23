package com.auribises.model;

import java.io.Serializable;

// Serializable -> Marker Interface
public class Customer implements Serializable{

	
	public String name;
	String phone;
	transient float temperature;
	String inTime;
	String outTime;
	
	public Customer() {
		
	}
	
	public Customer(String name, String phone, float temperature, String inTime, String outTime) {
		this.name = name;
		this.phone = phone;
		this.temperature = temperature;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", temperature=" + temperature + ", inTime=" + inTime
				+ ", outTime=" + outTime + "]";
	}
	
	public String toCSV() {
		return name+","+phone+","+temperature+","+inTime+","+outTime+"\n";
	}
	
}

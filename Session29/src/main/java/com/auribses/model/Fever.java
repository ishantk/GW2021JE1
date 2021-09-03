package com.auribses.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Fever {
	
	public String _id;
	public String userId;
	public double fever;
	public String dateTimeStamp;
	
	public Fever() {
		
	}
	
	public Fever(String userId, double fever) {
		this.userId = userId;
		this.fever = fever;
	}
	
	public Map toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("fever", fever);
		map.put("dateTimeStamp", new Date());
		return map;
	}
 

	@Override
	public String toString() {
		return "Fever [_id=" + _id + ", userId=" + userId + ", fever=" + fever + "]";
	}

}

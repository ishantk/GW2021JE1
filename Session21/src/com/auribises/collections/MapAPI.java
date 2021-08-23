package com.auribises.collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapAPI {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>(); // RTP
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		//TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// Thread-Safe
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(101, "John");
		map.put(1309, "Fionna");
		map.put(2139, "Dave");
		map.put(101, "Harry");
		map.put(456, "Fionna");
		//map.put(null, "Fionna");
		//map.put(null, "George");
		map.put(1122, null);
		
		System.out.println("map is:\n"+map);
		
		String name = map.get(1309);
		System.out.println("name is: "+name);
		
		map.forEach((key, value)->{
			System.out.println(key+"\t"+value);
		});
		
		System.out.println("\nKEYS");
		
		Set<Integer> keys = map.keySet();
		keys.forEach((key)->{
			System.out.println(key);
			System.out.println(map.get(key));
		});
		
		//map.clear();
		System.out.println(map.size());
		//map.putAll(map1);
		
		if(map.containsKey(101)) {
			System.out.println("Key 101 exists");
		}
		
		if(map.containsValue("Fionna")) {
			System.out.println("Fionna Exists");
		}
		
	}

}

package com.auribises.collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetAPI {

	public static void main(String[] args) {
		
		// Data is added not on indexing but with hashing
		// Unique Data
		//Set<String> set = new HashSet<E>(); // RTP
		//HashSet<String> set = new HashSet<String>(); // DO
		//LinkedHashSet<String> set = new LinkedHashSet<String>(); // DO
		TreeSet<String> set = new TreeSet<String>();
			
		set.add("John");
		set.add("Fionna");
		set.add("Kim");
		set.add("Dave");
		set.add("Sia");
		set.add("Sia");
		set.add("John");
		set.add("Anna");
		
		System.out.println("set is: "+set);
		
		set.remove("Sia");
		
		set.forEach((name)->{
			System.out.println(name);
		});
		
		System.out.println("~~~~~~~~~~~~~");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		//set.clear();
		//set.addAll(set1)
		System.out.println(set.size());
		
		// Assignment -> Explore how can we convert 1 collection to another
		// i.e eg: ArrayList to HashSet and many more combinations

	}

}

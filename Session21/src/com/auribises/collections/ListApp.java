package com.auribises.collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class ListApp {
	
	/*static void showData(LinkedList<String> list) {
		
		list.forEach((element)->{
			System.out.println(element);
		});
	}
	
	static void showData(ArrayList<String> list) {
		
		list.forEach((element)->{
			System.out.println(element);
		});
	}*/
	
	static void showData(List list) { // list can refer to any List
		
		list.forEach((element)->{
			System.out.println(element);
		});
	}
	

	public static void main(String[] args) {
	
		// Direct Object Construction
		LinkedList<String> list1 = new LinkedList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		Stack<String> list3 = new Stack<String>();
		Vector<String> list4 = new Vector<String>();
		
		// RTP
		List<String> list = new LinkedList<String>();
		list = new ArrayList<String>();
		list = new Stack<String>();
		list = new Vector<String>();
		
		ListApp.showData(list1);
		ListApp.showData(list2);
		ListApp.showData(list3);
		ListApp.showData(list4);
		
		Queue<String> queue = new PriorityQueue<String>();
		
		

	}

}

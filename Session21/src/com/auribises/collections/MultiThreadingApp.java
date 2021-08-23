package com.auribises.collections;
import java.util.ArrayList;

// Asynchronous Programming
// Concurrent Programming

/*class Printer{
	void printDocument(String name, int numOfCopies) {
		for(int i=1;i<=numOfCopies;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("[PRINTER] Priniting Document #"+i);
		}
	}
}*/

// Printer IS-A Thread
class Printer extends Thread{
	
	String documentName;
	int numOfCopies;
	
	Printer(){
		
	}
	
	Printer(String documentName, int numOfCopies){
		this.documentName = documentName;
		this.numOfCopies = numOfCopies;
		
	}
	
	public void run(){
		for(int i=1;i<=numOfCopies;i++) {
			System.out.println("[PRINTER] Priniting "+documentName+" #"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}

public class MultiThreadingApp {

	public static void main(String[] args) {
		
		System.out.println("[MAIN] App Started");
		
		//Printer printer = new Printer();
		//printer.printDocument("LearningJava.pdf", 10);
		Printer printer = new Printer("LearningJava.pdf", 10);
		printer.start(); // this will internally execute the run method
		
		ArrayList<Integer> productPrices = new ArrayList<Integer>();
		productPrices.add(22000);
		productPrices.add(12000);
		productPrices.add(32000);
		productPrices.add(12000);
		productPrices.add(21000);
		
		productPrices.forEach((price)->{
			System.out.println("[MAIN] ProductPrice: "+price);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		System.out.println("[MAIN] App Finished");

	}

}

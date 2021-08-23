package com.auribises.threads;

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
// 1. extends with Thread Class
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

// USE Runnable if your class has to extends another class as per some logic

class LaserPrinter{
	
}

//1. extends implements Runnable
class MyPrinter extends LaserPrinter implements Runnable{
	
	String documentName;
	int numOfCopies;
	
	MyPrinter(){
		
	}
	
	MyPrinter(String documentName, int numOfCopies){
		this.documentName = documentName;
		this.numOfCopies = numOfCopies;
		
	}
	
	public void run() {
		for(int i=1;i<=numOfCopies;i++) {
			System.out.println("[MYPRINTER] Priniting "+documentName+" #"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
	
}

public class MultiThreadingApp {
	
	
	// main thread
	public static void main(String[] args) {
		
		System.out.println("[MAIN] App Started");
		
		// Thread: NEW RUNNABLE TERMINATED
		// Thread: BLOCKED WAITING(TIME)
		
		//Printer printer = new Printer();
		//printer.printDocument("LearningJava.pdf", 10);
		Printer printer = new Printer("LearningJava.pdf", 10);
		System.out.println("1. STATE of printer: "+printer.getState());
		printer.start(); // this will internally execute the run method
		System.out.println("2. STATE of printer: "+printer.getState());
		try {
			// should be executed immediately after the start
			// will make printer thread to finish the execution completely and will make other threads to wait
			printer.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//MyPrinter myPrinter = new MyPrinter("LearningDSAlgo.pdf", 10);
		//myPrinter.start();
		
		Runnable r = new MyPrinter("LearningDSAlgo.pdf", 10);
		Thread th = new Thread(r);
		th.start();
		
		printer.setName("John");
		th.setName("Fionna");
		Thread.currentThread().setName("Jack");
		
		printer.setPriority(Thread.MAX_PRIORITY);
		th.setPriority(Thread.NORM_PRIORITY);
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
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
		
		System.out.println("Name of printer thread is:"+printer.getName()+" and Priority is: "+printer.getPriority());
		System.out.println("Name of myPrinter thread is:"+th.getName()+" and Priority is: "+th.getPriority());
		System.out.println("Name of main thread is:"+Thread.currentThread().getName()+" and Priority is: "+Thread.currentThread().getPriority());
		
		System.out.println("3. STATE of printer: "+printer.getState());
		
		System.out.println("[MAIN] App Finished");
		

	}

}


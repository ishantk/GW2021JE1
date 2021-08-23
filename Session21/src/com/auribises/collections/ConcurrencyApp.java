package com.auribises.collections;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ConcurrencyApp {

	public static void main(String[] args) {
		
		int i = 10;
		//Integer iref1 = new Integer(10);
		Integer iref1 = Integer.valueOf(10);
		
		// Thread Safe
		AtomicInteger iref2 = new AtomicInteger(10);

		// APIs
		//AtomicLong

	}

}

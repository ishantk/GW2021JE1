// Scanner is a built in class in Java
// we need to import it
import java.util.Scanner;

public class InputOutputStream {

	// main is a method i.e. a function created inside the class
	// whatever we code in main, is executed and in sequence
	public static void main(String[] args) {
		
		// STREAMS :)
		// Stream is flow of data
		
		// out is reference to the Object of PrintStream
		// PrintStream its a built in class which is OutputStream
		// which is used to write on console
		System.out.println("Hello All");
		
		// in is reference to the Object of InputStream
		// which is used to read from Console
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Your Name: ");
		String name = scanner.nextLine();
		System.out.println("Hello, "+name);
		
		System.out.println("Enter Your Age: ");
		int age = scanner.nextInt();
		
		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble();
		System.out.println("AGE: "+age);
		System.out.println("AMOUNT: \u20b9"+amount);
		

	}

}

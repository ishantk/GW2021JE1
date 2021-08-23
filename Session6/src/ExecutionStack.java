// In Java any program is basically a class
public class ExecutionStack {
	
	static int square(int num) {
		int result = num*num;
		return result;
	}

	// execution of program begins from main method
	// whatever we write in main will be executed in a sequence
	// main is the FIRST method to execute automatically
	public static void main(String[] args) {
		int number = 10;
		char ch = '\u20b9';
		System.out.println("Welcome to Main Method");
		
		int squareOfNumber = square(number);
		
		System.out.println("This is Awesome");
		System.out.println("B.Byee...");
		System.out.println("squareOfNumber is: "+squareOfNumber);
	}

}

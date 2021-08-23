
public class Recursion {
	
	
	/*static void printNumbers(int n) {
		for(int i=n;i>0;i--) {
			System.out.println(i);
		}
	}*/
	
	// Recursion: it is execution of the same method from itself repeatedly
	// Relacement of loops :) -> For Complex Problems :) [problems w.r.t Tree Data Structure]

	static void printNumbers(int n) {
		System.out.println(n);
		n--;
		
		if(n>0) {
			printNumbers(n);
		}
		
	}
	
	
	public static void main(String[] args) {
	

		System.out.println("[MAIN] - START");
		
		int numbers = 3;
		
		printNumbers(numbers);

		
		System.out.println("[MAIN] - END");
		
		
	}

}

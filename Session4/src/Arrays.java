
public class Arrays {

	public static void main(String[] args) {
		
		// IMPLICIT
		// Syntax1
		//int countryCaseStatus[] = {23422, 30400, 645151, 3000};

		// Syntax2
		//int[] countryCaseStatus = {23422, 30400, 645151, 3000};
		
		
		// EXPLICIT
		// Syntax3
		//int[] countryCaseStatus = new int[]{23422, 30400, 645151, 3000};
		
		// Syntax4
		int countryCaseStatus[] = new int[]{23422, 30400, 645151, 3000};
		// Updating Array Index
		countryCaseStatus[2] = 76544;
		
		// new int[]
		// new is an operator
		// new allocates the memory to the Array dynamically i.e at RUN TIME
		
		System.out.println("countryCaseStatus is: "+countryCaseStatus);
		
		// Syntax5
		// Creating an Empty Array
		int numbers[] = new int[5];
		// in the above array creation all the elements will be 0 by default
		
		// UPDATE OPERATION
		numbers[3] = 99;
		
		System.out.println("numbers[0] is: "+numbers[0]);
		System.out.println("numbers[1] is: "+numbers[1]);
		System.out.println("numbers[2] is: "+numbers[2]);
		System.out.println("numbers[3] is: "+numbers[3]);
		System.out.println("numbers[4] is: "+numbers[4]);
		
		// Syntax6
		int numbers1[], numbers2, n3[];
		numbers1 = new int[5]; // numbers1 is an array reference
		numbers2 = 10; // is an int
		n3 = new int[10];
		
		// Syntax7
		int[] numbers3, numbers4, numbers5;
		numbers3 = new int[5];
		numbers4 = new int[10];
		
		int size = 10;
		numbers5 = new int[size];
		
		// Garbage Collector :)
		System.gc();
		
	}

}

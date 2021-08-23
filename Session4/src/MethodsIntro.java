
public class MethodsIntro {
	
	// Defining a Method
	static void findMinimum(int[] array) {
		
		System.out.println("array is: "+array);
		
		int min = array[0];
		for(int idx=1;idx<array.length;idx++) {
			if(array[idx] < min) { 
				min = array[idx]; 
			}
		}
		System.out.println("Minimum is: "+min);
	}

	public static void main(String[] args) {
		
		int[] marks = {90, 70, 60, 80, 88};
		int[] ages = {10, 30, 35, 8, 90, 66, 20};
		int[] productPrices = {2000, 2100, 3500, 5100, 1150};
		
		System.out.println("marks is: "+marks);
		System.out.println("ages is: "+ages);
		System.out.println("productPrices"+productPrices);
		
		// Executing a Method
		findMinimum(marks);
		findMinimum(ages);
		findMinimum(productPrices);
		
		/*
		// Assume
		int min = marks[0]; // min 90
		
		for(int idx=1;idx<marks.length;idx++) {
			if(marks[idx] < min) { 
				min = marks[idx]; // min 60
			}
		}
		
		System.out.println("Minimum in marks is: "+min);
		
		min = ages[0];
		for(int idx=1;idx<ages.length;idx++) {
			if(ages[idx] < min) { 
				min = ages[idx]; // min 60
			}
		}
		System.out.println("Minimum in ages is: "+min);
		
		min = productPrices[0];
		for(int idx=1;idx<productPrices.length;idx++) {
			if(productPrices[idx] < min) { 
				min = productPrices[idx]; // min 60
			}
		}
		System.out.println("Minimum in productPrices is: "+min);
		*/

	}

}

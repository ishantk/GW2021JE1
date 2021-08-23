
public class ReadArrays {

	public static void main(String[] args) {
		
		// Loops :)
		int numbers[] = {10, 20, 30, 40, 50};
		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);
		
		System.out.println("FOR");

		for(int idx=0;idx<numbers.length;idx++) {
			System.out.println(numbers[idx]);
		}
		
		
		System.out.println("WHILE");
		int idx=0;
		while(idx<numbers.length) {
			System.out.println(numbers[idx]);
			idx++;
		}
		
		System.out.println("DO WHILE");
		
		idx = 0;
		do {
			System.out.println(numbers[idx]);
			idx++;
		}while(idx<numbers.length);
		
		// Enhanced For Loop -> READ ONLY LOOP
		// OR For Each Loop
		System.out.println("Enhanced For");
		
		for(int element : numbers) {
			System.out.println(element);
		}

	}

}

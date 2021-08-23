
public class MaxNumberWithRecursion {
	
	/*static int findMax(int[] data) {
	
		int max = data[0];
		for(int element : data) {
			if(element > max) {
				max = element;
			}
		}
		
		return max;
		
	}*/
	
	
	static int findMax(int[] data, int length) {
		
		
		if(length == 1) {
			return data[0];
		}
		
		
		int result = findMax(data, length-1);		
		
		
		if(result > data[length-1]) {
			return result;
		}else {
			return data[length-1];
		}
		
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("[MAIN] - START");
		
		int[] numbers = {100, 20, 30};
		int maxNumber = findMax(numbers, numbers.length);
		System.out.println("MAX IS:"+maxNumber);
		
		System.out.println("[MAIN] - END");

	}

}

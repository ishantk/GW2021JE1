
public class BubbleSortAlgo {

	public static void main(String[] args) {
		
		int[] data = {11, 5, 20, 8, 17, 12};

		// Reference Link: https://visualgo.net/en/sorting
		// Bubble Sort
		for(int i=0;i<data.length;i++) {
			System.out.println("For i: "+i);
			System.out.println("j is: ");
			for(int j=0;j<data.length - i - 1; j++) {
				System.out.print(j+" ");
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
			System.out.println();
		}
		
		System.out.println("################");
		
		for(int element : data) {
			System.out.print(element+"  ");
		}
		
		
		// Output -> 5, 8, 11, 12, 17, 20
	}

}

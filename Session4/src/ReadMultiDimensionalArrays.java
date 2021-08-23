
public class ReadMultiDimensionalArrays {

	public static void main(String[] args) {
		
		int[][] india = {
				{41324, 64352, 14311, 8787}, // 0
				{41324, 64352, 14311, 8787}, // 1
				{41324, 64352, 14311, 8787}, // 2
				{41324, 64352, 14311, 8787}, // 3
				{41324, 64352, 14311, 8787, 56551, 12345}, // 4
		};
		
		for(int idx=0;idx<india.length;idx++) {
			System.out.println("india[" + idx + "] is: " + india[idx]);
		}
		
		// 0 1 2 3 4
		for(int idx=0;idx<india.length;idx++) {
			// idx: 0 | 0 - 3
			// idx: 1 | 0 - 3
			// idx: 2 | 0 - 3
			// idx: 3 | 0 - 3
			// idx: 4 | 0 - 5
			for(int internalIdx=0;internalIdx<india[idx].length;internalIdx++) {
				System.out.print(india[idx][internalIdx]+"     ");
			}
			System.out.println();
		}
		
		System.out.println("*********************");
		
		for(int[] array : india) {
			for(int element : array) {
				System.out.print(element+"  ");
			}
			System.out.println();
		}


	}

}

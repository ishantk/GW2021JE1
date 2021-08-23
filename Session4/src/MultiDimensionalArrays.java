
public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		//						0      1     2     3
		int[] maharashtra = {41324, 64352, 14311, 8787};
		int[] punjab = {41324, 64352, 14311, 8787};
		int[] pune = {41324, 64352, 14311, 8787};
		int[] delhi = {41324, 64352, 14311, 8787};
		
		System.out.println("maharashtra is: "+maharashtra);	// HashCode
		System.out.println("maharashtra[1] is: "+maharashtra[1]); // 64352
		System.out.println("maharashtra length: "+maharashtra.length); // 4
		
		// Array of Arrays
		int[][] india = {
				{41324, 64352, 14311, 8787}, // 0
				{41324, 64352, 14311, 8787}, // 1
				{41324, 64352, 14311, 8787}, // 2
				{41324, 64352, 14311, 8787}, // 3
				{41324, 64352, 14311, 8787, 56551, 12345}, // 4
		};
		
		int[][] usa = {
				{41324, 64352, 14311, 8787}, // 0
				{41324, 64352, 14311, 8787}, // 1
				{41324, 64352, 14311, 8787}, // 2
				{41324, 64352, 14311, 8787}, // 3
				{41324, 64352, 14311, 8787, 56551, 12345}, // 4
		};
		
		System.out.println("india is: "+india);			  // HashCode
		System.out.println("india[1] is: "+india[1]);     // HashCode
		System.out.println("india[1] is: "+india[1].length); //4
		System.out.println("india[1][1] is: "+india[1][1]); //64352
		System.out.println("india length: "+india.length); //5

		int [][][] world = {
			{
					{41324, 64352, 14311, 8787}, // 0
					{41324, 64352, 14311, 8787}, // 1
					{41324, 64352, 14311, 8787}, // 2				// 0
					{41324, 64352, 14311, 8787}, // 3
					{41324, 64352, 14311, 8787, 56551, 12345}, // 4
			},
			{
				{41324, 64352, 14311, 8787}, // 0
				{41324, 64352, 14311, 8787}, // 1
				{41324, 64352, 14311, 8787}, // 2					// 1
				{41324, 64352, 14311, 8787}, // 3
				{41324, 64352, 14311, 8787, 56551, 12345}, // 4
			}
		};
		
		System.out.println("world length is: "+world.length);	// 2
		System.out.println("world[0] length is: "+world[0].length); // 5
		System.out.println("world[0][2] length is: "+world[0][2].length); // 4
		System.out.println("world[0][2][0] is: "+world[0][2][0]); // 41324
		
		// myArray1 will have 3 1d arrays
		// every 1-d array will have 5 elements
		// and all the elements will be 0
		int [][] myArray1 = new int[3][5];
		
		// JAGGED ARRAYS
		int [][] myArray2 = new int[3][];
		myArray2[0] = new int[5];
		myArray2[1] = new int[15];
		myArray2[2] = new int[25];
		
	}

}

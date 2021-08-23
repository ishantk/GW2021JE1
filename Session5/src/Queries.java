
public class Queries {

	public static void main(String[] args) {
		
		/*int[][] arr2D = {
				{10},
				{10, 20},
				{10, 20, 30},
				{10, 20, 30, 40},
				{10, 20, 30, 40, 50},
		};*/
		
		int[][] arr2D = new int[5][];
		arr2D[0] = new int[1];
		arr2D[1] = new int[2];
		arr2D[2] = new int[3];
		arr2D[3] = new int[4];
		arr2D[4] = new int[5];
		
		int[][][] arr3D = { 
							  {
								{11, 20, 30},
								{10, 22, 30},
								{10, 20, 33},
							  },
							  {
								{22, 33, 44},
								{55, 66, 77},
								{88, 99, 110},
						      }
						 };
		
		System.out.println("arr3D[0][1][1] is: "+arr3D[0][1][1]); // 22
		
		for(int i=0;i<arr3D.length;i++) {
			for(int j=0;j<arr3D[i].length;j++) {
				for(int k=0;k<arr3D[i][j].length;k++) {
					System.out.print(arr3D[i][j][k]+"  ");
				}
				System.out.println();
			}
			System.out.println("~~~~~~~~~~~~~~");
		}
		
		//System.gc();
	
	}

}

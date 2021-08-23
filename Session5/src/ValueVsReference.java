
public class ValueVsReference {

	public static void main(String[] args) {
		
		// Create Operation for x
		int x = 10;
		
		// Create Operation for y
		// Value Copy :)
		int y = x;	
		
		// Update Operation
		y += 10;
		
		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a);
		
		int[] b = a;	// Reference Copy
		System.out.println(b);
		
		// Update Operation
		for(int i=0;i<b.length;i++) {
			b[i] += 5;
		}
		
		for(int element : a) {
			System.out.print(element+"  ");
		}
		
		System.out.println();
		
		for(int element : b) {
			System.out.print(element+"  ");
		}
		
		
	}

}

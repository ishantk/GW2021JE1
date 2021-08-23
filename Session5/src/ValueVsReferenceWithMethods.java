
public class ValueVsReferenceWithMethods {

	
	static void updateValue(int b) {
		b += 5;
		System.out.println("b is: "+b);
	}
	
	static void updateValues(int[] b) {
		for(int i=0;i<b.length;i++) {
			b[i] += 5;
		}
	}
	
	
	public static void main(String[] args) {
		
		int x = 10;
		
		System.out.println("x is: "+x);	// 10
		
		
		updateValue(x);	// VALUE COPY
		
		
		System.out.println("x now is: "+x); // 10
		
		
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a);
		
		for(int element : a) {
			System.out.print(element+"  ");
		}
		
		System.out.println();
		
		updateValues(a);
		
		System.out.println("Finally a is:");
		for(int element : a) {
			System.out.print(element+"  ");
		}
		
		

	}

}

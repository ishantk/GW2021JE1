
public class StringAPI {

	public static void main(String[] args) {
		
		int i = 10;
		
		// Interned Strings
		String s1 = "Hello";
		String s2 = "HELlo";

		// String Objects
		String s3 = new String("Hello");
		String s4 = new String("heLLO");
		
		//String s4 = new String("Hello").intern();
		
		System.out.println("i is: "+i);
		
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);
		
		// toString will be executed automatically if we do not execute it ourselves
		System.out.println("s1.toString() is: "+s1.toString());
		System.out.println("s2.toString() is: "+s2.toString());
		System.out.println("s3.toString() is: "+s3.toString());
		System.out.println("s4.toString() is: "+s4.toString());
		
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4) {
			System.out.println("s3 == s4");
		}else {
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3) {
			System.out.println("s1 == s3");
		}else {
			System.out.println("s1 != s3");
		}
		
		if(s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}else {
			System.out.println("s1 not equals s2");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 equalsIgnoreCase s2");
		}else {
			System.out.println("s1 not equalsIgnoreCase s2");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3 equals s4");
		}else {
			System.out.println("s3 not equals s4");
		}
		
		if(s1.equals(s3)) {
			System.out.println("s1 equals s3");
		}else {
			System.out.println("s1 not equals s3");
		}
		
		
		if(s1.contentEquals(s2)) {
			System.out.println("s1 contentEquals s2");
		}else {
			System.out.println("s1 not contentEquals s2");
		}
		
		// Assignment: equals vs contentEquals
		
		//if(s1.compareTo(s2) == 0) {
		if(s1.compareToIgnoreCase(s2) == 0) {
			System.out.println("s1 compareTo s2");
		}else {
			System.out.println("s1 not compareTo s2");
		}

	}

}

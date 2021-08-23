
public class MutableStrings {

	public static void main(String[] args) {
		
		// Immutable String
		String str = new String("Hello");
		str.concat(" World");
		System.out.println("str is: "+str);

		
		// Mutable String
		// StringBuilder -> NOT THREAD SAFE
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		builder.reverse();
		System.out.println("builder is: "+builder);
		
		// StringBuffer -> THREAD SAFE
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		System.out.println("buffer is: "+buffer);
		
		// Assignment: Explore the built in methods of StringBuffer and StringBuilder
	}

}

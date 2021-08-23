
public class Queries {

	public static void main(String[] args) {
		
		String quote = "be exceptional";
		
		char[] array = quote.toCharArray();
		System.out.println("array is: "+array);
		
		for(int i=0;i<array.length;i++) {
			
			if(i==0) {
				int iCh = (int)array[i] - 32;
				System.out.println("iCh is: "+iCh);
				char ch = (char)iCh;
				
				System.out.println("ch is: "+ch);
				
				array[i] = ch;
			}
		}
		
		String newQuote = new String(array);
		System.out.println(newQuote);

	}

}

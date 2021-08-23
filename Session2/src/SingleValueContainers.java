// SingleValueContainers -> They represent data as values
public class SingleValueContainers {

	// main is a method
	// whatever we write in main, will be executed in a sequence
	public static void main(String[] args) {

		
		// Primitive Types
		
		
		// Integral Data Type
		//  byte	8 bits
		//  short	16
		//  int		32
		//  long	64
		
		// data i.e. 10 we call it as literal
		// it gets stored in constant pool and it will take 32bits of memory space
		// age is storage container and will take 8 bits in memory
		byte age = 10;	// 0 0 0 0   0 0 0 0   0 0 0 0   0 0 0 0   0 0 0 0   0 0 0 0   0 0 0 0   1 0 1 0

		// 8 bits -> 2 power 8 -> 256
		// -128 to 0 to 127
		
		// DOWNCASTING is when we copy the data from a larger container to a smaller container, we need to cast
		// data copied may not be the same as bit size varies
		age = (byte)128;
		System.out.println("age is: "+age);
		
		short salary = 10000; 
		// 10000 is  literal, it gets saved in constant pool first and than we copy 16 bits of data into salary container
		
		// LHS data which is a storage container in main frame
		// RHS literal which is in Constant pool, both are same sizes and hence is perfect
		int data = 110010;
		
		// LHS phoneNumber is storage container in main frame of size 64bits
		// RHS 9915571177 is a literal which now is out of 32bits
		long phoneNumber = 9915571177L;
		
		// Whenever we try to copy from a larger container to a smaller container, we will get error
		
		// error
		//int number = phoneNumber;
		
		// hence, you need to cast
		// But here, possible loss of data may happen
		int number = (int)phoneNumber;
		System.out.println("number is: "+number);
		
		// UPCASTING -> Happening automatically :)
		// copy the data from less capacity storage container into more capacity storage container
		long number1 = data;
		
		// Floating Point Data Type
		//  float	32 bits
		//  double	64 bits
		
		// here, pi is 32bits and 3.14 literal is 64 bits
		// hence an error
		//float pi = 3.14;
		
		// we can do downcasting
		//float pi = (float)3.14;
		
		// we can make the literal to be saved in the same size i.e. 32 bits
		//float pi = 3.14F;
		
		// LHS and RHS are both 64 bits :)
		double pi = 3.14;
		
		
		int number2 = 10;
		
		// Logical or Boolean
		//   boolean 8 bits -> out of 8 bits only 1 bit is used for value -> 1/0
		//   true -> makes the bit to go as 1
		//   false -> makes the bit to go as 0
		
		boolean isInternetEnabled = true;
		isInternetEnabled = false;
		
		// Characters
		// char -> 16bits -> ASCII CODE or UNICODE
		
		// Reference to UniCode Table -> https://unicode-table.com/en/#0A07
		
		char ch = 'A'; 
		char rupee = '\u20b9';
		char nameChar1 = '\u0a07';
		char nameChar2 = '\u0a07';
		char nameChar3 = '\u0a07';
		
		System.out.println("ch is: "+ch);
		System.out.println("rupee is: "+rupee);
		System.out.println("NAME in PUNJABI is: "+nameChar1);
		
		// Assignment : Write your name in your native language using unicdes
				
	}

}

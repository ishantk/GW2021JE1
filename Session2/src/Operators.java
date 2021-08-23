
public class Operators {

	public static void main(String[] args) {
			
		// CONTROLLER -> Logical Operations or Computations or Iterations
		
		// Operators -> They form the Computation part of controller

		// Arithmetic Operators
		// +, -, *, /, %
		
		int num1 = 10;
		int num2 = 3;
		
		int result = num1 % num2;
		System.out.println("Remainder is: "+result);
		
		
		int data = 260;
		int buckets = 13;
		
		// % plays an important role in Hashing
		// https://www.cs.usfca.edu/~galles/visualization/OpenHash.html
		
		int hashCode = data % buckets; // Hashing Algo -> get the remainder :)
		System.out.println("HashCode of "+data+" is: "+hashCode);
		
		// Assignment Operators
		// =, +=, -=, *=, /=, %=
		
		// Update value in hasCode by performing computation
		//hashCode = hashCode + 2;
		hashCode += 2;
		System.out.println("hashCode now is: "+hashCode);
		
		// Increment/Decrement Operators
		
		int dishQuantity = 0;
		dishQuantity++;	// 1
		++dishQuantity;	// 2
		
		dishQuantity--; // 1
		--dishQuantity; // 0
		
		dishQuantity++; // 1
		System.out.println("dishQuantity is: "+dishQuantity);
		
		
		dishQuantity = 10;
		
		//int finalQuanity = dishQuantity++;
		int finalQuanity = ++dishQuantity;
		System.out.println("finalQuanity is: "+finalQuanity+" and dishQuantity is: "+dishQuantity);
		
		// Conditional Operators
		// For Logic Decisions in algorithm
		// >, <, >=, <=, ==, !=
		
		int payTMWallet = 50;
		int cabFare = 350;
		
		System.out.println("Can the Cab be Booked: "+ (cabFare < payTMWallet) );
		
		int promoCode = 101; // Flat 50% off but for amount > 500
		int cartAmount = 1200;
		
		System.out.println("Will i get Dicount: "+ (cartAmount > 500));
		
		// Logical Operators
		// &&, ||, !
		
		System.out.println("Will i get Dicount: "+ (promoCode == 101 && cartAmount > 500));
		
		// Bitwise Operators
		// & | ^
		
		int num3 = 8;	// 1 0 0 0	
		int num4 = 12;  // 1 1 0 0
		
		//			    // 1 0 0 0	-> 8	
		int result1 = num3 & num4;
		//				   1 1 0 0  -> 12
		int result2 = num3 | num4;
		//				   0 1 0 0  -> 4	
		int result3 = num3 ^ num4;
		System.out.println("result1 is: "+result1);
		System.out.println("result2 is: "+result2);
		System.out.println("result3 is: "+result3);
		
		// Shift Operators
		// >>, <<, >>>
		
		int num5 = 8;				// 1 0 0 0
		int result4 = num5 >> 2;    // 1 0 0 0 >> 2  -> _ _ 1 0  -> 0 0 1 0
		//							   _ 1 0 0
		//							   _ _ 1 0	-> 0 0 1 0 -> 2
		
		// Left Shift -> Divide the number by 2 as base and power as shift
		// i.e. 8 / 2 pow 2 -> 8/4 -> 2
		
		System.out.println("result4 is: "+result4);
		
		int result5 = num5 << 2;	// 0 0 0 0  1 0 0 0
		//							   0 0 0 1  0 0 0 _
		//							   0 0 1 0  0 0 _ _
		//							   0 0 1 0  0 0 0 0
		
		// Right Shift -> Multiple the number by 2 as base and power as shift
		// i.e. 8 * 2 pow 2 -> 8 * 4 -> 32
		
		System.out.println("result5 is: "+result5);
		
		int amount = 12;
		int secureKey = 2;
		
		amount = amount >> secureKey;
		System.out.println("Trasnacted Amount is: "+amount);
		
		amount = amount << secureKey;
		System.out.println("Received Amount is: "+amount);
		
		int num6 = -11;
		int result6 = num6 >> 2;
		System.out.println("result6 is: "+result6);
		
		// 11 in binary -> 1 0 1 1
		// -11 in binary -> 0 1 0 0	-> 1s Complement
		//						  1 -> 2s Complement

		// -11			->  0 1 0 1	
		
		//		0 1 0 1 >> 2
		//      _ _ 0 1
		//      1 1 0 1
		
		//      0 0 1 0
		//            1
		//      0 0 1 1 ->  -3
		
		// Ternary Operator
		// ? :
		
		
		int youtubeMember = 1;	// 0 is kid, 1 free, 2 is paid
		
		String message = (youtubeMember == 2) ? "Paid Member, Welcome to Youtube" : "Free Access, You will see Ads";
		System.out.println("Message is: "+message);
		
	}

}

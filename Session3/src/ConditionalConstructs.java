import java.util.Scanner;

public class ConditionalConstructs {

	public static void main(String[] args) {
		
		// Object Construction Statement
		// We have created an Object of Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter PromoCode: ");
		String promoCode = scanner.nextLine();
		
		System.out.println("Enter Amount: ");
		double amount = scanner.nextDouble();
		
		System.out.println("[PROMOCODE] "+promoCode);
		System.out.println("[AMOUNT] \u20b9"+amount);
		
		// Release the memory resources :)
		scanner.close();
		
		/*
		if(promoCode.equals("NOCOOKING")) {
			System.out.println("Promo Code Applied");
		}else {
			System.out.println("Invalid Promo Code");
		}*/
		
		// Nested if/else
		if(promoCode.equals("NOCOOKING")) {
			System.out.println("Promo Code Applied");
			
			if(amount >= 159) {
				System.out.println("Discount Available");
				
				double discount = amount * 0.5;
				
				if(discount >= 100) {
					System.out.println("Discount: \u20b9 100");
					amount -= 100;
				}else {
					System.out.println("Discount: \u20b9 "+discount);
					amount -= discount;
				}
			}else {
				System.out.println("Discount Not Available");
				System.out.println("Enter Dishes worth \u20b9"+(159.0 - amount)+" more");
			}
			
		}else if(promoCode.equals("HELLO150")) {
			
		}else {
			System.out.println("Invalid Promo Code");
		}
		
		
		System.out.println("PLEASE PAY: \u20b9" + amount);
		
		/*if(promoCode.equals("NOCOOKING") && amount >= 159) {
			System.out.println("Promo Code Applied");
		}else {
			System.out.println("Invalid Promo Code");
		}*/
		

	}

}

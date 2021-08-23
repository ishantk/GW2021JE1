
/*
 	
 	Model -> Arrays, OOPS[Objects]
 	Controller -> if/else operators loops
 	View -> Scanner and syso
 	
 	John owns a Credit Card | 1st transaction will begin from 1st month i.e. January
 	He can perform 1 transaction in 1 moth
 	10% interest | 10000 + 1000 -> 11000
 	
 	What min John can Pay -> eg: 3000
 	
 	Pay before you make any other transaction in next moth :)
 	
 	Goal:
 	The moment John makes a transaction show him the month of zero billing amount
 	and the amount to be paid in last month
 	
 	1: 10000 -> 1000 -> 11000
 	2: 3000
 	3: 3000
 	4: 3000
 	5: 2000
 	
 	
 	
 */

class Transaction{
	
	int month;
	int amount;
	int interest;
	int totalAmount;
	int dues;
	
	Transaction(){
		
	}
	
	Transaction(int month, int amount, int interest) {
		this.month = month;
		this.amount = amount;
		this.interest = interest;
		totalAmount = amount+interest;
		dues = totalAmount;
	}

	@Override
	public String toString() {
		return "Transaction [month=" + month + ", amount=" + amount + ", interest=" + interest + ", totalAmount="
				+ totalAmount + ", dues=" + dues + "]";
	}
	
	
	
}

public class Assignment {

	public static void main(String[] args) {
		
//		Transaction t1 = new Transaction(1, 10000, 1000);
//		Transaction t2 = new Transaction();
//		Transaction t3 = new Transaction();
//		Transaction t4 = new Transaction();
//		Transaction t5 = new Transaction();
		//Transaction t6 = t3; // Reference Copy :)
		
		int a1 = 10;
		int a2 = 20;
		int a3 = 30;
		int a4 = 40;
		int a5 = 50;
		
		// Array of Integers
		int[] array = new int[]{a1, a2, a3, a4, a5};
		
		// Array of Objects :)
		//Transaction[] transactionArray = new Transaction[] {t1, t2, t3, t4, t5};
		Transaction[] transactionArray = new Transaction[5];
		transactionArray[0] = new Transaction(1, 10000, 1000);
		transactionArray[1] = new Transaction();
		transactionArray[2] = new Transaction();
		transactionArray[3] = new Transaction();
		transactionArray[4] = new Transaction();
		
		for(Transaction transaction : transactionArray) {
			System.out.println(transaction);
		}
		
	}

}

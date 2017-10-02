import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner moolah = new Scanner(System.in);
		
		
		int itemCost;
		int tendered;
		int changeDue;
		
		System.out.print("Enter the price of the item: $" );
		itemCost = (int) Math.round(moolah.nextDouble() * 100);
		
		System.out.print("Enter the tendered amount: $" );
		tendered = (int) Math.round(moolah.nextDouble() * 100);
		
		if (tendered > itemCost) {
			System.out.println("The customer is due: " );
			
		changeDue = tendered - itemCost;
             
			// Since we multiplied by 100 you have to divide by 10000 to get the number of $100 bills owed. 
			int Hundred = changeDue / 10000;
			if (Hundred > 0) {//if the change is less than $100 this will be a zero
				changeDue = changeDue % 10000;// this resets the value of change to the remainder after the twenties are calculated but only if there was at least enough to make a Hundred 
				System.out.println(Hundred + " $100 Bill(s)");
			}
			
			// Since we multiplied by 100 you have to divide by 5000 to get the number of $50 owed. 
			int Fifties = changeDue / 5000;
			if (Fifties > 0) {//if the change is less than $50 this will be a zero
				changeDue = changeDue % 5000;// this resets the value of change to the remainder after the twenties are calculated but only if there was at least enough to make a Fifty
				System.out.println(Fifties + " $50 Bill(s)");
			}
			
			//and so on
			int Twenties = changeDue / 2000;
			if (Twenties > 0) {  
				changeDue = changeDue % 2000; 
				System.out.println(Twenties + " $20 Bill(s)");
			}
			
			int Tens = changeDue / 1000;
			if (Tens > 0) {
				changeDue = changeDue % 1000;
				System.out.println(Tens + " $10 Bill(s)");
			}
			
			int Fives = changeDue / 500;
			if (Fives > 0) {
				changeDue = changeDue % 500;
				System.out.println(Fives + " $5 Bill(s)");
			}
			
			int Ones = changeDue / 100;
			if (Ones > 0) {
				changeDue = changeDue % 100;
				System.out.println(Ones + " $1 Bill(s)");
			}
			
			int Quarters = changeDue / 25;
			if (Quarters > 0) {
				changeDue = changeDue % 25;
				System.out.println(Quarters + " Quarter coin(s)");
			}
			
			int Dimes = changeDue / 10;
			if (Dimes > 0) {
				changeDue = changeDue % 10;
				System.out.println(Dimes + " Dime coin(s)");
			}
			
			int Nickels = changeDue / 5;
			if (Nickels > 0) {
				changeDue = changeDue % 5;
				System.out.println(Nickels + " Nickel coin(s)");
			}
			
			//if none of the above matches the remainder then all thats left are pennies
			int Pennies = changeDue;
			System.out.println(Pennies + " Penny coin(s)");
		}
		if (tendered < itemCost) {  //if the amount tendered is less than the price of the item
			System.out.print("You don't have enough for this item.");
		}
		
		else if (tendered == itemCost) { //if exact amount is given
			System.out.print("Exact change. Thank you.");
		}
	}
}



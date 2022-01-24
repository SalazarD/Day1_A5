package problem2_3_4;

import java.util.Scanner;





public class MoneyDemo {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		
		System.out.println("Enter Number Of Pennies:");
		int numberOfPennies = scanner.nextInt();
		
		System.out.println("Enter Number Of Nickles:");
		int numberOfNickles = scanner.nextInt();
		
		System.out.println("Enter Number Of Dimes:");
		int numberOfDimes = scanner.nextInt();
		
		System.out.println("Enter Number Of Quarters:");
		int numberOfQuarters = scanner.nextInt();
		
		Money money = new Money(numberOfPennies, numberOfNickles, numberOfDimes, numberOfQuarters);
		System.out.println("Total: "+String.format("%.2f", money.getTotal()));
		
		System.out.println("Enter Number Of Additional Pennies:");
		int numberOfPenniesNew = scanner.nextInt();
		money.addPennies(numberOfPenniesNew);
		
		System.out.println("Enter Number Of Additional Nickles:");
		int numberOfNicklesNew = scanner.nextInt();
		money.addNickles(numberOfNicklesNew);
		
		System.out.println("Enter Number Of Additional Dimes:");
		int numberOfDimesNew = scanner.nextInt();
		money.addDimes(numberOfDimesNew);
		
		System.out.println("Enter Number Of Additional Quarters:");
		int numberOfQuartersNew = scanner.nextInt();
		money.addQuarters(numberOfQuartersNew);
		
		System.out.println("Total: "+String.format("%.2f", money.getTotal()));
		
		scanner.close();
	}
	
}

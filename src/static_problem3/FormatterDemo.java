package static_problem3;

import java.util.Scanner;

public class FormatterDemo {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		
		System.out.println("Enter Amount of Money:");
		double num = scanner.nextDouble();
		System.out.println("$" + Formatter.toDollars(num));
		
	}

}

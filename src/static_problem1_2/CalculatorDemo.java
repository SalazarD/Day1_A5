package static_problem1_2;

import java.util.Scanner;

public class CalculatorDemo {
	
		
		private static Scanner scanner = new Scanner(System.in);

		public static void main(String args[]) {
			
			System.out.println("Enter First Number:");
			double num1 = scanner.nextDouble();
			
			System.out.println("Enter Second Number:");
			double num2 = scanner.nextDouble();
			
			System.out.println("Enter Third Number:");
			double num3 = scanner.nextDouble();
			
			
		
			System.out.println(num1 + " + " + num2 + " = " + Calculator.add(num1, num2));
			System.out.println(num1 + " - " + num2 + " = " + Calculator.subtract(num1, num2));
			System.out.println(num1 + " * " + num2 + " = " + Calculator.multiply(num1, num2));
			System.out.println(num1 + " / " + num2 + " = " + Calculator.divide(num1, num2));
			System.out.println(num1 + "^2 = " + Calculator.square(num1));
			System.out.println(num1 + "^3 = " + Calculator.cube(num1));
			System.out.println("Average of " + num1 + "," + num2 + "," + num3 + " = " + Calculator.average(num1,num2,num3));
			
			scanner.close();
			
		}

	}

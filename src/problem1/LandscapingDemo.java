package problem1;

import java.util.Scanner;

public class LandscapingDemo {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Length of land (in feet):");
		double length = scanner.nextDouble();
		
		System.out.println("Width of land (in feet):");
		double width = scanner.nextDouble();
		
		Land land = new Land(length, width);
		
		double parameter = land.getParameter();
		System.out.println("Fencing needed: "+parameter+" feet.");
		
		double area = land.getArea();
		System.out.println("Mulch needed: "+area+" square feet.");
		
		scanner.close();
		}
	
	
}

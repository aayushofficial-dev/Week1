package Workshop;

import java.util.Scanner;

public class question10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number:");
		float a = in.nextFloat();
		System.out.println("Enter the second number:");
		float b = in.nextFloat();
		System.out.println("Addition of " + a +" and " + b + " is: " + (a + b));
		System.out.println("Subtraction of " + a +" difference " + b + " is: " + (a - b));
		System.out.println("Multiplication of " + a +" multiply " + b + " is: " + (a * b));
		System.out.println("Division of " + a +" divide " + b + " is: " + (a / b));
	}
}

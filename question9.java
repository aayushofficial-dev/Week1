package Workshop;

import java.util.Scanner;

public class question9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		float p = in.nextFloat();
		System.out.println("Enter the rate of interest:");
		float r = in.nextFloat();
		System.out.println("Enter the time period:");
		float t = in.nextFloat();
		double si = (p * t * r) / 100;
		System.out.println("Simple of interest:" + si);	
	}
}
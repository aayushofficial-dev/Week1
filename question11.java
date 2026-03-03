package Workshop;

import java.util.Scanner;

public class question11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the distance in miles: ");
		float miles = in.nextFloat();
		double km = miles * 1.60934;
		System.out.println(miles + " miles is equal to " + km + " kilometers.");
	}
}

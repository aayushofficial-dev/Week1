package Workshop;

import java.util.Scanner;

public class question7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the temperature in celcius:");
		float c = in.nextFloat();
		double f = c * 9/5 + 32;
		System.out.println(f + ".f");
	}
}

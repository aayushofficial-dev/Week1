package Workshop;

import java.util.Scanner;

public class question14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount in USD:");
		int amount = in.nextInt();
		System.out.println("Enter the exchange rate:");
		float rate = in.nextFloat();
		double convert_amnt = amount * rate;
		System.out.println("Converted amount:" + convert_amnt);
	}
}

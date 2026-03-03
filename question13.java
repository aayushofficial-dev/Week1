package Workshop;

import java.util.Scanner;

public class question13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the quantity:");
		int quantity = in.nextInt();
		System.out.println("Enter the price:");
		double price = in.nextDouble();
		double total = quantity * price;
		System.out.println("The total cost is: " + total);
		
	}
}

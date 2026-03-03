package Workshop;

import java.util.Scanner;

public class question5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length:");
		float length = in.nextFloat();
		System.out.println("Enter the width:");
		float width = in.nextFloat();
		double perimeter = 2 * (length + width);
		System.out.println("Perimeter of a rectange: " + perimeter);
	}
}

package Workshop;

import java.util.Scanner;

public class question4 {
	public static void  main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the side a: ");
		float a = in.nextFloat();
		System.out.println("Enter the side b: ");
		float b = in.nextFloat();
		System.out.println("Enter the side c: ");
		float c = in.nextFloat();
		float s = (a + b + c) / 2;
		double semi = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area of a triangle is: " + semi);
	}
}

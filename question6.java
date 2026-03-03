package Workshop;

import java.util.Scanner;

public class question6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of one side: ");
		float length = in.nextFloat();
		double square = length * length;
		System.out.println("Area of a square: " + square);
	}
}

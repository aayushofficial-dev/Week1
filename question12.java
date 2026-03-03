package Workshop;

import java.util.Scanner;

public class question12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius:");
		float radius = in.nextFloat();
		double area = Math.PI * radius * radius;
		System.out.println("Area of a circle: " + area);
	}
}

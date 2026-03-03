package Workshop;

import java.util.Scanner;

public class question8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of the cylinder: ");
		float radius = in.nextFloat();
		System.out.println("Enter the height of the cylinder: ");
		float height = in.nextFloat();
//		double volume = Math.PI * Math.pow(radius, 2) * height;
		double volume = Math.PI * radius * radius * height; 
		System.out.println("Volume of cylinder: " + volume);
	}
}

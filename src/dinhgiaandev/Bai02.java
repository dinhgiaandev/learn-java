package dinhgiaandev;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = scanner.nextInt();

		System.out.print("Enter height: ");
		int height = scanner.nextInt();

		System.out.println("Perimeter = " + ((width + height) * 2));

		System.out.println("Acreage = " + (width * height));

		System.out.println("Smallest edge = " + Math.min(width, height));

		scanner.close();
	}
}

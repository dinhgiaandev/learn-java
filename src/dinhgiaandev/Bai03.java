package dinhgiaandev;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter edge: ");
		int edge = scanner.nextInt();

		System.out.println("Volume = " + Math.pow(edge, 3));

		scanner.close();
	}
}

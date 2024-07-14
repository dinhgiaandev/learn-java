package dinhgiaandev;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter student name: ");
		String studentName = scanner.nextLine();

		System.out.print("Enter medium score: ");
		double studentScrore = scanner.nextDouble();

		System.out.println(studentName + " có điểm = " + studentScrore);
		scanner.close();
	}
}

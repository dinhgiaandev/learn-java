package dinhgiaandev;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("First number: ");
		int number1 = scanner.nextInt();
		System.out.print("Second number: ");
		int number2 = scanner.nextInt();
		System.out.println(Math.random());
		scanner.close();
	}
}

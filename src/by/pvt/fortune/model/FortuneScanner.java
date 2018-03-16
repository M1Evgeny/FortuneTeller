package by.pvt.fortune.model;

import java.util.Scanner;

public class FortuneScanner {
	private static Scanner sc = new Scanner(System.in);

	public static int readChoiseNumber() {
		int choice = 0;
		do {
			System.out.println("Make your choice thoughtfully!");
			while (!sc.hasNextInt()) {
				System.out.println("This is not a number!");
				sc.next();
			}
			choice = sc.nextInt();
		} while (choice > 2 || choice < 1);
		return choice;
	}
}

package practice;

import java.util.Scanner;

public class PrimeN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter No: ");
		int number = sc.nextInt();
		int count = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count++;
				break;
			}
		}
		if (count == 1) {
			System.out.println("not a prime no");
		}

		else {
			System.out.println("prime No");
		}
	}
}

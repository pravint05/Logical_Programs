package logical_programs;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		int Num = sc.nextInt();
		if (Num % 2 == 0) {
			System.out.println("Given No is Even No");
		}
		else
		{
			System.out.println("Given no is odd No");
		}

	}

}

package logical_programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int fact=1;
		System.out.print("Enter number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
}

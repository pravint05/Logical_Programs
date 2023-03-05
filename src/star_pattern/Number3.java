package star_pattern;

public class Number3 {
	
	 // 	1
	 //    121
	 //   12321
	 //  1234321
	 // 123454321

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) // column
		{
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) // row
			{
				System.out.print(k);
			}

			for (int m = i - 1; m > 0; m--) 
			{
				System.out.print(m);
			}

			System.out.println();
		}

	}
}

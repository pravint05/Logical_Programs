package star_pattern;

public class Star4 {
	
	//	  *
	//	 **
	// 	***
	// ****
	//*****

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) // column
		{
			for (int k = 4; k >= i; k--) // row
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) // row
			{
				System.out.print("*");
			}
			System.out.println();

		}

	}

}

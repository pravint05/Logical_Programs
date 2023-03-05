package star_pattern;

public class Star7 {
	
	// * * * * *
	//  * * * *
	//   * * *
	//    * *
	//     *
	

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) //column
		{
			for (int k = 2; k <= i; k++) //row
			{
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) //row
			{
				System.out.print(" *");
			}
			System.out.println();	//next line
		}

	}

}

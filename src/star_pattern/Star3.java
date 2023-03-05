package star_pattern;

public class Star3 {

	// 	 *****
	//	 ****
	//	 ***
	//	 **
	//	 *
	public static void main(String[] args) {

		for(int i=5;i>=1;i--)//column
		{
			for(int a=1;a<=i;a++)//row
			{
				System.out.print("*");
			}
			System.out.println();//next Line
		}

	}

}

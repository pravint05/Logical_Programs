package star_pattern;

public class Number4 {
	
	//	1*
	//	1*2
	//	1*23
	//	1*234
	//	1*2345

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) // column
		{
			for(int j=1; j<=1;j++)
			{
				System.out.print("1*");
			}
			
			for (int a = 2; a <= i; a++) // row
			{
				System.out.print(a);
			}
			System.out.println();// next line
		}

	}

}

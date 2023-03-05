package star_pattern;

public class Star1 {
	//	*****
	//	*****
	//	*****
	//	*****

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++)//column
		{
			for(int j=1; j<=5;j++)//row
			{
				System.out.print("*");
			}
			System.out.println();//next line
		}
		

	}

}

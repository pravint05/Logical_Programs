package star_pattern;

public class Star2 {
	
	//	*
	//	**
	//	***
	//	****
	//	*****
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)	//column
		{
			for(int a=1;a<=i;a++)	//row
			{
				System.out.print("*");
			}
			System.out.println();//next line
		}
	}

}

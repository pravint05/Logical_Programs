package star_pattern;

public class Number5 {

	public static void main(String[] args) {
		 //   1
		 //   2   4
		 //   3   6   9
		 //   4   8   12  16
		 //   5   10  15  20  25
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(j*i+" ");
			}
			System.out.println();
		}
		

	}

}

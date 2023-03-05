package star_pattern;

public class Star12 {

	public static void main(String[] args) {
		// * * * * * 
		//  * * * * 
		//   * * * 
		//    * * 
		//     * 
		//    * * 
		//   * * * 
		//  * * * * 
		// * * * * * 
		
		for(int i=1; i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=5; k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int x=2; x<=5;x++)
		{
			for(int y=4;y>=x;y--)
			{
				System.out.print(" ");
			}
			
			for(int z=1; z<=x;z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

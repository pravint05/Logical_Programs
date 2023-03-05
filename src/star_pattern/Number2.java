package star_pattern;

public class Number2 {
	
	// 1
	// 21
	// 321
	// 4321
	// 54321

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) // column
		{ 
			for (int k = i; k > 0; k--) // row
			{
				System.out.print(k);
			}
			System.out.println();// next line
		}
	}
}

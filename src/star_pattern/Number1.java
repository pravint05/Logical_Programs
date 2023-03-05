package star_pattern;

public class Number1 {

	// 1
	// 12
	// 123
	// 1234
	// 12345

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) // column
		{
			for (int a = 1; a <= i; a++) // row
			{
				System.out.print(a);
			}
			System.out.println();// next line
		}
	}
}

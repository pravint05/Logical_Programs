package logical_programs;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		for (int i = 1; i <= 10; i++) {
			System.out.print(a + ", "); // 0,1,1,2,3,5,8,13........
			c = a + b; // 1,2,3,5,8,13,21
			a = b; // 1,1,2,3,5,8,13
			b = c; // 1,2,3,5,8,13,21

		}

	}

}

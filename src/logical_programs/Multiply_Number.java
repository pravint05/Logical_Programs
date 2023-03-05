package logical_programs;

public class Multiply_Number {

	// multiply number without using multiplication operator

	public static void main(String[] args) {
		int Num1 = 5;
		int Num2 = 2;
		int sum = 0;

		for (int i = 1; i <= Num1; i++) {
			sum = sum + Num2;
		}
		System.out.println(sum);

	}

}

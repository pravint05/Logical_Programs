package logical_programs;

public class Prime_Number {

	public static void main(String[] args) {
		int org = 7;
		int count = 0;

		for (int i = 2; i < org; i++) {
			if (org % i == 0) {
				count++;
				break;
			}
		}

		if (count == 1) {
			System.out.println("Given number is not a prime number");
		}

		else {
			System.out.println("Given number is a prime number");
		}
	}

}

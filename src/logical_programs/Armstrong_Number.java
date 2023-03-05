package logical_programs;

public class Armstrong_Number {

	public static void main(String[] args) {

		int org = 153;
		int sum = 0;
		for (int i = org; i > 0; i = i / 10) {
			int rem = i % 10;
			sum = sum + (rem * rem * rem);
		}
		if (org == sum) {
			System.out.println("Given number is Armstrong Number");
		} else {
			System.out.println("Given number is not a Armstrong Number");
		}

	}

}

package practice;

public class ArmstrongNo {

	public static void main(String[] args) {
		int org = 153;
		int rev = 0;

		for (int i = org; i >0 ; i = i / 10) {
			int rem = i % 10;
			rev =rev+ rem * rem * rem;

		}
		System.out.println(rev);
	}

}

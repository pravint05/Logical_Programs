package logical_programs;

public class Swaping_Of_Numbers {

	public static void main(String[] args) {

		int a = 90;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a); // 20
		System.out.println(b); // 90

	}

}

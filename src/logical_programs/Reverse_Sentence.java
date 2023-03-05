package logical_programs;

public class Reverse_Sentence {

	public static void main(String[] args) {

		String S1 = "i am playing";
		String A1 = reversestring(S1);
		System.out.println(A1);

	}

	public static String reversestring(String sentence) {
		String[] text = sentence.split(" ");
		String rev = " ";

		for (int i = text.length - 1; i >= 0; i--) {

			rev = rev + text[i] + " ";
		}
		return rev;
	}

}

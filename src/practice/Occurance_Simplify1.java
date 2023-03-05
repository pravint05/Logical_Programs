package practice;

import java.util.HashMap;
import java.util.Set;

public class Occurance_Simplify1 {

	public static void main(String[] args) {

		String S1 = "abcdabccbcda";
		HashMap<Character, Integer> A1 = new HashMap<Character, Integer>();

		for (int i = 0; i <= S1.length() - 1; i++) {
			char C1 = S1.charAt(i);
			if (A1.containsKey(C1)) {
				A1.put(C1, A1.get(C1) + 1);
			} else {
				A1.put(C1, 1);
			}
		}

		Set<Character> D1 = A1.keySet();
		for (Character E1 : D1) {
			System.out.println(E1 + ":" + A1.get(E1));
		}
	}

}

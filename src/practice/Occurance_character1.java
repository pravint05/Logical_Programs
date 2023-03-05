package practice;

import java.util.HashMap;
import java.util.Set;

public class Occurance_character1 {

	public static void main(String[] args) {

		String S1 = "abcdccabaad";
		HashMap<Character, Integer> A1 = new HashMap<Character, Integer>();

		for (int i = 0; i <= S1.length() - 1; i++) {
			char charvalue = S1.charAt(i);
			if (A1.containsKey(charvalue)) {
				A1.put(charvalue, A1.get(charvalue) + 1);
			} else {
				A1.put(charvalue, 1);
			}
		}

		Set<Character> keys = A1.keySet();

		for (Character key : keys) {
			System.out.println(key + ":" + A1.get(key));
		}

	}

}

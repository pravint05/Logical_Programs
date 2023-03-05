package logical_programs;

import java.util.HashMap;
import java.util.Map;

public class Occurance_String2 {

	public static void main(String[] args) {
		String S1 = "Big black bug bit a big black dog on his big black nose";
		String[] words = S1.split(" ");
		Map<String, Integer> hashMap = new HashMap<>();

		for (String word : words) {
			Integer integer = hashMap.get(word);
			if (hashMap.containsKey(word)) {
				hashMap.put(word, hashMap.get(word) + 1);
			} else {
				hashMap.put(word, 1);
			}
		}
		System.out.println(hashMap);
	}
}

package logical_programs;

public class White_Spaces {
	public static void main(String[] args) {

		String org = " abC d DF G kigghjkll hjkioolol ";
		int count = 0;

		for (int i = 0; i <= org.length() - 1; i++) {
			char charvalue = org.charAt(i);
			if (charvalue == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}

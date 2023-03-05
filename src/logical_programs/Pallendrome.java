package logical_programs;

public class Pallendrome {

	public static void main(String[] args) {
		String Original = "madam";
		String Rev = "";

		for (int i = Original.length() - 1; i >= 0; i--) {
			Rev = Rev + Original.charAt(i);
		}
		if (Original.equals(Rev)) {
			System.out.println("Given String is a Pallendrome");
		}

		else {
			System.out.println("Given String is not a Pallendrome");
		}
	}

}

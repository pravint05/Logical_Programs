package logical_programs;

public class Reverse_String {

	public static void main(String[] args) {
		
		String Original="Dattatray";
		String Rev="";
		
		for(int i=Original.length()-1; i>=0; i--)
		{
			Rev=Rev+Original.charAt(i);
		}

		System.out.println(Rev);
	}

}

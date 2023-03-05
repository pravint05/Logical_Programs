package practice;

public class Reverses_sent {

	public static void main(String[] args) {
		
		String S1="i am playing";
		String Return=m1(S1);
		System.out.println(Return);
	}
		public static String m1(String sentence)
		{
		String[] S2=sentence.split(" ");
		String rev="";
		
		for(int i=S2.length-1; i>=0;  i--)
		{
			rev=rev+S2[i]+" ";
		}
		return rev;
	}

}

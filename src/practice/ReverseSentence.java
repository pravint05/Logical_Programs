package practice;

public class ReverseSentence {

	public static void main(String[] args) {

		String S1 = "i am playing";
		String P=reverse(S1);
		System.out.println(P);
	}
	
	public static String reverse(String sentence)
	{
		String[] A1=sentence.split(" ");
		String rev="";
		
		for(int i=A1.length-1; i>=0;i--)
		{
			rev=rev+A1[i]+" ";
		}
		return rev;
	}
}
package practice;

public class ReverseString {

	public static void main(String[] args) {
	String org="pravin";
	String rev="";
	
	for(int i=org.length()-1; i>=0; i--)
	{
		rev=rev+org.charAt(i);
	}
System.out.println(rev);
	}

}

package practice;

public class WSpaces {

	public static void main(String[] args) {
		String S1="abcd acd ccd bcdw";
		int count=0;
		
		for(int i=0; i<=S1.length()-1;i++)
		{
			char S2=S1.charAt(i);
			if(S2==' ')
			{
				count++;
			}
		}
System.out.println(count);
	}

}

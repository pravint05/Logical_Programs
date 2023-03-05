package practice;

import java.util.HashMap;

public class Occ_String_words {

	public static void main(String[] args) {
		
		String S1="Big black bug bit a big black dog on his big black nose";
		HashMap<String,Integer> H1=new HashMap<String,Integer>();
		String[] SP=S1.split(" ");
		
		for(String Str:SP)
		{
			Integer itr =H1.get(Str);
			if(itr==null)
			{
				H1.put(Str, 1);
			}
			else
			{
				H1.put(Str, itr+1);
			}
		}
		System.out.println(H1);

	}

}

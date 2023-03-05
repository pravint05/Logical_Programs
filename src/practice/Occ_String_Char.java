package practice;

import java.util.HashMap;
import java.util.Set;

public class Occ_String_Char {

	public static void main(String[] args) {
		
		String S1="adbcbbddbbcdeea";
		HashMap<Character,Integer> H1=new HashMap<Character,Integer>();
		
		for(int i=0; i<=S1.length()-1;i++)
		{char charvalue=S1.charAt(i);
			if(H1.containsKey(charvalue))
			{
			H1.put(charvalue, H1.get(charvalue)+1);
			}
			else
			{
				H1.put(charvalue, 1);
			}
		}
		Set<Character> keys= H1.keySet();
		for(Character key:keys)
		{
			System.out.println(key+":"+H1.get(key));
		}
		
	}

}

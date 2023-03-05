package logical_programs;

import java.util.HashMap;
import java.util.Set;

public class Occurance_Of_each_character_using_hashmap {

	public static void main(String[] args) {
		String org="abcbcabd";
		HashMap<Character, Integer> mp=new 	HashMap<Character, Integer>();
		     
		     //i=0        0<=7                 1
		                 //1<=7                2
		                 //2<=7                3
		                 //3<=7                4
		                 //4<=7                5
		                 //5<=7                6
		                 //6<=7                7
		                 //7<=7                8
		                 //8<=7
		for(int i=0;      i<=org.length()-1;  i++ )
		{                     
			         //d             //7
			 char charvalue=org.charAt(i);
			      
			     //            //d
			 if(mp.containsKey(charvalue)) //true
			 {           //b             //b
					mp.put(charvalue, mp.get(charvalue)+1);
			 }    
			 else 
			 {            //d
				 mp.put(charvalue, 1);
			 }    	     
		 }
			
			Set<Character> keys = mp.keySet();
		           
			          //b
		for(Character key:keys)   //a  b  c  d
		{                       //b:             //b  
			System.out.println(key +":"+ mp.get(key));  //3
		}

	}

}

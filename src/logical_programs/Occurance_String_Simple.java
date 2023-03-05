package logical_programs;

import java.util.HashMap;

public class Occurance_String_Simple {

	public static void main(String[] args) {
		String S1="Ashwini Pravin Pravin Pravin dattatray DST PDT AAI";
		HashMap<String,Integer> A1=new HashMap<String,Integer>();
		String[] B1=S1.split(" ");
		
		
			for(String C:B1)
			{
				Integer Nmbr=A1.get(C);
				
			if(Nmbr==null)
			{
				A1.put(C, 1);
			}
			else
			{
				A1.put(C, Nmbr+1);
			}
			}
		System.out.println(A1);


	}

}

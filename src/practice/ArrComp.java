package practice;

import java.util.Arrays;

public class ArrComp {

	public static void main(String[] args) {
		
		int Ar1[]= {10,20,30};
		int Ar2[]= {10,20,30};
		int Ar3[]= {20,30,10};
		
		System.out.println(Arrays.equals(Ar1, Ar2));
		System.out.println(Arrays.equals(Ar1, Ar3));
		System.out.println(Arrays.equals(Ar2, Ar3));
		
		

	}

}

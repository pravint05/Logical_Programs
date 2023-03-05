package practice;

import java.util.Arrays;

public class array {
	

	
	public static void main(String[] args) {
		int Arr1[]= {10,20,30};
		int Arr2[]= {20,30,10};
		int Arr3[]= {10,20,30};
		
		System.out.println(Arrays.equals(Arr1, Arr2));
		System.out.println(Arrays.equals(Arr2, Arr3));
		System.out.println(Arrays.equals(Arr1, Arr3));
		
	}

}

package practice;

import java.util.Arrays;

public class ArrayCompare {
	public static void main(String[] args) {
		int arr1[] = {10,20,30};
		int arr2[] = {20,20,30};
		int arr3[] = {10,20,30};
	System.out.println(Arrays.equals(arr1, arr2));
	System.out.println(Arrays.equals(arr2, arr3));
	System.out.println(Arrays.equals(arr1, arr3));
	}

}

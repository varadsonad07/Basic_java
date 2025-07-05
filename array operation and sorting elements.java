package com.sunbeam;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		int[] arr1 = {1,6,4,5,50,34};
		
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		Arrays.sort(arr1); // direct method for sorting array elements
		
		System.out.println("sorting elements is : ");
		for(int i = 0 ; i < arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		System.out.println(""+Arrays.toString(arr1)); // direct method for sorting array elements 
		                                              // it can print array elements inside the bracket [ ]
	}

}

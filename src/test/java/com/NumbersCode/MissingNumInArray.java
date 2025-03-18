package com.NumbersCode;

import java.util.HashSet;

public class MissingNumInArray {

	public static void main(String[] args) {

		// Array should not have duplicates // Array no need to be sorted order //
//		  Values should be in range

		int[] a = { 1, 2, 4, 5, 6 }; // 1+2+3+5+6 = 17 // 1+2+3+4+5+6= 20

		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}

		int sum2 = 0;

		for (int i = 1; i <= 6; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("The missing number is: " + (sum2 - sum1));

//		

//		 int[] arr = {5, 2, 9, 1, 6, 3};
//	     
//	     
//	     for (int i=1; i<arr.length; i++){ // i=0 || i=1
//	         int smallest =  0;
//	         int biggest = 0;
//	         for (int j=i+1; j<arr.length; j++){ // j= 1 j<5 j++ || j=2 j<5 j++ ||
//	        	 
//	             if(arr[j]<arr[i]){ // 1 > 0 failed || 9 > 
//	                 smallest = arr[i];
//	                 System.out.println(smallest);
//	             } else {
//	            	 biggest = arr[i];
//	            	 System.err.println(biggest);
//	             }
//	            
//	         }
//	     }
//	    
//	
	}

}

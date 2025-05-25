package com.interviewQuestions;

import java.util.Arrays;


public class ArrayListElementTraverse {

	public static void main(String[] args) {
		
		 int[] arr = {1, 2, 3, 4, 5}; // Original array
		 
	        arr = shiftRight(arr); // Shift operation
	        
	        System.out.println("Shifted Array: " + Arrays.toString(arr));
	    }

	    public static int[] shiftRight(int[] arr) {
	        if (arr.length <= 1) 
	        	return arr; // No shift needed for small arrays

	        int lastElement = arr[arr.length - 1]; // Store last element

	        // Shift elements to the right
	        for (int i = arr.length - 1; i > 0; i--) {
	        	
	            arr[i] = arr[i - 1];
	        }

	        arr[0] = lastElement; // Place last element at the first position
	        return arr;

	}
}


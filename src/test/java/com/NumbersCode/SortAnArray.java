package com.NumbersCode;
import java.util.*;

public class SortAnArray {

	 public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 3};

	        System.out.println("Original Array: " + Arrays.toString(arr));

	        bubbleSort(arr); // Sort the array

	        System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));
	    }

	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;

	        // Outer loop for passes
	        for (int i = 0; i < n - 1; i++) {
	            boolean swapped = false;

	            // Inner loop for comparing adjacent elements
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // Optimization: if no swaps, array is already sorted
	            if (!swapped) break;
	        }
	    }
/*
 *  public static void main(String[] args) {
        int[] arr = {8, 3, 1, 6, 2, 10};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sort the array in ascending order
        Arrays.sort(arr);
        	
 		// Sort the array in DEcending order
//        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));
    }
 */
}

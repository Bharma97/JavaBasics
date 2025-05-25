package com.NumbersCode;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArray {

	 public static void main(String[] args) {
		 
	        int[] array = {2, 4, 2, 5, 4, 6, 7};

	        Set<Integer> set = new LinkedHashSet<>();
	        for (int num : array) {
	            set.add(num); // HashSet removes duplicates automatically
	        }

	        // Convert Set back to array
	        int[] result = set.stream().mapToInt(Integer::intValue).toArray();

	        // Print result
	        System.out.println(Arrays.toString(result));
	    
	}
	 /*
	  *  public static void main(String[] args) {
        int[] array = {3, 5, 2, 3, 1, 5, 6};

        int[] result = Arrays.stream(array)
                             .distinct()   // removes duplicates
                             .toArray();

        System.out.println(Arrays.toString(result));
    }
	  */
/*
 *  public static void main(String[] args) {
        int[] arr = {2, 4, 2, 5, 4, 6, 7};
        int n = arr.length;

        System.out.print("Unique elements: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
 */
}

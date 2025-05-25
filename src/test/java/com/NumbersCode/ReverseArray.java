package com.NumbersCode;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
    	
        int[] arr = {1, 2, 3, 4, 5}; 
        
        int i = 0;
        
        int j = arr.length - 1; // Start and End Index
        
        int temp;
        
        while (i < j) {
            // Swapping arr[i] and arr[j]
              temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;  // Move right
            j--;  // Move left
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
    /*
     * Stack<Integer> stack = new Stack<>();
		int[] arr = {1, 2, 3};

		for (int num : arr) stack.push(num);
		for (int i = 0; i < arr.length; i++) 
		arr[i] = stack.pop();
		System.out.println(Arrays.toString(arr);
     */
}

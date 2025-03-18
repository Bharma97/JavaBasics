package com.NumbersCode;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        int i = 0, j = arr.length - 1; // Start and End Index

        while (i < j) {
            // Swapping arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;  // Move right
            j--;  // Move left
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

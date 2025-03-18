package com.NumbersCode;

public class SmallestAndLargestNum {

	public static void main(String[] args) {
		// Find the largest number and smallest number:
		/*
		 * Take 2 for loop and compare both values then take smallest in that assign
		 * that one as small and big
		 * 
		 */
		int[] arr = { 15, 2, 9, 12, 5, 6, 3, 10, 45 };
		int smallest = arr[0];
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("Smallest " + smallest);
		System.out.println("Largest " + largest);
	}
}

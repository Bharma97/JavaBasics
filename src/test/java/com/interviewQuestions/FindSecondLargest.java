package com.interviewQuestions;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] arr = { 4, 3, 25, 6, 7, 8, 9, 2, 3, 10, 1 };
		
		int largest = 0;
		
		int sLargest = 0;
		
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] > arr[largest]) {
				
				largest = i;

			}
			
			if (largest < arr[i]) {
				
				sLargest = i;
			}
		}
		System.out.println(arr[largest]);
		
		System.out.println(arr[sLargest]);

	}

}

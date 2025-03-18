package com.NumbersCode;

public class FindLargestNum {

	public static void main(String[] args) {
		/*
		 * 
		 */

		int[] a = { 10, 7, 55, 8, 3 };
		int largest = 0;
		for (int i = 1; i < a.length; i++) { // array contains total from 0-4 started from 1
			if (a[i] > a[largest]) { // 7 is not greater then 10 || 5 !> 10 || 8 !> 10 || 3!>10
				largest = i;
			}
		}
		System.out.println(a[largest]);
	}

}

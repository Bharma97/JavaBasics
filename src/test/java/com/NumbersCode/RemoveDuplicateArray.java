package com.NumbersCode;

public class RemoveDuplicateArray {

	public static void main(String[] args) {

		int[] a = { 1, 1, 2, 2, 2 };
		int n = a.length;
		removeDuplicartes(a, n);

		// printing the array elements
		for (int i = 0; i < n; i++) {
			System.out.println(a[i] + 1);
		}
	}

	static int removeDuplicartes(int a[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		// creating another array for only storing
		// the unique elements
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[n - 1];
		// Changing the original array
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}

		return j;
	}

}

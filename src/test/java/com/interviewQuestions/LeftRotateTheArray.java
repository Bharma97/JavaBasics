package com.interviewQuestions;

public class LeftRotateTheArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		int d = 2; //position of the array where we need to start the rotation
		
		int N = arr.length;
		
		rotate(arr, d, N);
	}
	
	static void rotate(int[] arr,int d, int N) {
		
		int[] temp = new int[N];
		
		int k = 0;
		
		for(int i=d; i<N; i++) {
			temp[k] = arr[i];
			k++;
		}
		
		for(int j=0; j<d; j++) {
			temp[k] = arr[j];
			k++;
		}
		
		for (int i = 0; i < N; i++) {
            System.out.print(temp[i] + " ");
        }
	}
	
}

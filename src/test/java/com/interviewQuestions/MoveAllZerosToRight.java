package com.interviewQuestions;

public class MoveAllZerosToRight {

	public static void main(String[] args) {
		
		int[] arr = {0,1,0,3,12,0,34};
		
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
				
			} 
		}
		while(count<arr.length) {
			arr[count++]=0;
		}
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		
		
	}

}

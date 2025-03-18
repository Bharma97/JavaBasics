package com.NumbersCode;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
	/*
	 * 
	 * For example, if we want to compute the 3rd term of the series, then it is the sum of the 1st and the 2nd term. Note that 
	 * the first two terms of the Fibonacci series are defined as 0 and 1. Thus, the 3rd term will be 0 + 1 = 1. The 4th 
	 * term will be the sum of the 3rd and the 2nd terms, 1 + 1 = 2. The 5th term will be the sum of the 4th and the 3rd term, 
	 * which is 2 + 1 = 3. Thus the Fibonacci series looks like the following. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, … 
	 * (considering 1 - indexing)

	Therefore, in general, the nth term of the series can be written as
	
	F(n) = F(n - 1) + F(n - 2)

	 */
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int first = 0; // First fibonacci number.
		int second = 1; // Second fibonacci number.
		
		// handling the corner cases when the N is 0 or negative. Note that we are treating this   
		// series with 1-indexing.
		
		if(N==1) {
			System.out.println(first);
		} else if(N==2) {
			System.out.println(first);
		} else {
			// loop for the Nth fibonacci numbers  
			int curr = 0;
			for (int i=3; i<=N; i++) {
				curr = first + second;
				first= second;
				second = curr;
			}
			System.out.println("The "+N+"th fibonacci number is "+ curr);
		}		

	}

}

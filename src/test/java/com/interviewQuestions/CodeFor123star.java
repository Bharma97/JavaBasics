package com.interviewQuestions;

public class CodeFor123star {

	public static void main(String[] args) {
		
		int n=4;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i+j==3) {// for first star change logic to i==j
					System.out.print("* "); // Print '*' on diagonal positions
				} else {
					System.out.print((j+1)+" "); // Print numbers
				}
				
			}
			System.out.println();
		}

	}

}
/* O/P
 * 	1 2 3 * 
	1 2 * 4 
	1 * 3 4 
 	* 2 3 4 
 */

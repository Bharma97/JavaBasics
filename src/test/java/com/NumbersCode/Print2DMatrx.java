package com.NumbersCode;

import java.util.Scanner;

public class Print2DMatrx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int [] [] mat = new int[N] [N];
		
		for(int i=0;i<N; i++) {
			for(int j=0;j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		//Display row wise
		
		for (int i=0; i<N; i++) {
			System.out.print("Row "+ i + " : ");
			for (int j=0; j<N; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("\t");
		}
		
		System.out.println();
		// Display column wise
		for (int j=0; j<N; j++) {
			System.out.print("Col "+ j+" : ");
			for(int i=0; i<N; i++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("\t");
		}
		
	}
	/*
	 * 3
1 2 3
4 5 6
7 8 9
Output:
Row 0 : 1 2 3
Row 1 : 4 5 6
Row 2 : 7 8 9
Col 0 : 1 4 7
Col 1 : 2 5 8
Col 2 : 3 6 9
	 */

}

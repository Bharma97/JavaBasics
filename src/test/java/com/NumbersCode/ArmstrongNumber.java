package com.NumbersCode;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		/*
		 * The armstrong number should achieve below 
		 * 
		 * 153 = 1*1*1 + 5*5*5 + 3*3*3
		 * 	   = 1 + 125 + 27
		 * 	   = 153
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");

		int number = sc.nextInt();
		int temp = number;
		int r = 0;
		int sum = 0;
		while (number > 0) {
			r = number % 10; // 153%10 = 3 || 15%10 = 5 || 1%10=1
			number = number / 10; // 153/10 = 15 || 15/10 = 1 || 1/10=0
			sum = sum + r * r * r; // 0 +27 || 27 + 125 || 125 + 1
		}
		
		if(temp==sum) {
			System.out.println("Its an armstrong number");
		} else {
			System.out.println("It's not an armstrong number");
		}
	}

}


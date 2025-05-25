package com.NumbersCode;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number: ");
		
//		454 == 454
		int number = sc.nextInt();
		
		int ref_num = number;
		
		int reversedNum = 0;
		
		while (number!=0) {
			reversedNum = reversedNum*10 + number%10;
			number = number/10;
		}
		
		if (reversedNum==ref_num) {
			System.out.println("The given number is palidrome");
		} else {
			System.out.println("The given number is not an palidrome");
		}
	}
}

package com.NumbersCode;

import java.util.Scanner;

public class ReverseNumber {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int number = sc.nextInt();
		
		int reverse = 0;
		
		while(number!=0) {
			
			reverse = reverse*10 + number%10;
			
			number = number/10;
		}
		
		System.out.println("The reverse of the given number is "+ reverse);
	}
	
	
}

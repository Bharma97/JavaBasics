package com.NumbersCode;

import java.util.Scanner;

public class CountDigitFreq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int D = sc.nextInt();
		
		int X = digitFreequent(num, D);
		
		System.out.println(" The digits "+D+ " occurs "+ X + " times in "+ num);
	}
	
	static int digitFreequent(int num, int D) {
		
		if( num==0 && D==0) return 1;
		
		if(num<0) return num;
		
		int counter = 0;
		while(num!=0) {
			int digit = num%10; // for calculating how many digits are there;
			if(digit == D) counter++;
			num = num/10;
		}
		return counter;
	}

}

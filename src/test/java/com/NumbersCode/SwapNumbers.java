package com.NumbersCode;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int a = scanner.nextInt();
		System.out.print("Enter second number: ");
		int b = scanner.nextInt();
		a = a+b; 
		b = a-b; 
		a = a-b; 
		System.out.println("After swapping: first = " + a + ", second = " + b);
	}

}

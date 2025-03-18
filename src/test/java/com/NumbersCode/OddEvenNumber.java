package com.NumbersCode;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.err.println(number + " is even.");
		} else {
			System.err.println(number + " is odd.");
		}
	}

}

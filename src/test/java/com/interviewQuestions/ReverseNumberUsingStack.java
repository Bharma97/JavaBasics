package com.interviewQuestions;

import java.util.Stack;

public class ReverseNumberUsingStack {

	static Stack<Integer> st = new Stack<>();

	public static void main(String[] args) {
		int number = 3995;
		System.out.println(reverse_number(number));

	}

	static void push_Digits(int number) {
		while (number != 0) {
			st.push(number % 10);
			number = number / 10;
		}
	}

	static int reverse_number(int number) {
		push_Digits(number);
		int reverse = 0;
		int i = 1;
		while (!st.isEmpty()) {
			reverse = reverse + (st.peek() * i);
			st.pop();
			i = i * 10;

		}
		return reverse;

	}

}

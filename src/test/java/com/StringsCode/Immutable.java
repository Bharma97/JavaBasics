package com.StringsCode;

public class Immutable {

	public static void main(String args[]) {
		String first = "Bharma";
		String second = first;
		 first = second + "Gowda";
		if(first==second) {
			System.out.println("Strings are not immutable.");  
		} else {
			System.out.println("Strings are immutable.");  
		}
	}
}

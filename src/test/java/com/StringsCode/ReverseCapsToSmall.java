package com.StringsCode;

public class ReverseCapsToSmall {

	/*
	 * If the character is uppercase (between 'A' and 'Z'), it converts it to lowercase 
	 * by adding 32 (the ASCII difference between uppercase and lowercase letters).
		If the character is lowercase (between 'a' and 'z'),
	    it converts it to uppercase by subtracting 32.
	 */
	
	public static void main(String[] args) {
		String name = "BharmagowdaBS";
		StringBuilder apnd = new StringBuilder("");
		for (int i =  0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				apnd.append((char) (ch + 32));
			}
			if (ch >= 'a' && ch <= 'z') {
				apnd.append((char) (ch - 32));
			}
		}
		System.out.println("After changing this " + apnd);

	}
}

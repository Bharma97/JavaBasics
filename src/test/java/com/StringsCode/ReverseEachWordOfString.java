package com.StringsCode;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		reverseEachWordOfString("Java programming is difficult");
	}
	
	static void reverseEachWordOfString(String inputString) {
		String[] rt = inputString.split(" ");
		String reverseString = "";
		for(int i=0; i<rt.length; i++) {
			String tr = rt[i];
			String nstr = "";
			for(int j=0; j<tr.length();j++) {
				char ch = tr.charAt(j);
				nstr = ch+nstr;
				
			}
			reverseString = reverseString+nstr+" ";
		}
		System.out.println(inputString);
		System.out.println(reverseString);
	}
}

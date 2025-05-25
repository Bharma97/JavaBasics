package com.StringsCode;

import java.util.Arrays;

public class CheckStringsAreAnagrams {
	
	public static void main(String[] args) {
		/*
		 * 	In Java, we have two strings named str1 and str2. We are checking if str1 and str2 are anagrams.
			We first convert the strings to lowercase. 
			It is because Java is case sensitive and R and r are two difference characters in Java.
		Here,

			str1.toCharArray() - converts the string into a char array
			Arrays.sort() - sorts both the char arrays
			Arrays.equal() - checks if the sorted char array are equal
		 */
		
		String str1 = "Race";
		String str2 = "Care";
		 str1 = str1.toLowerCase();
		 str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length()) {
			
			char[] charArray1 = str1.toCharArray();
			
			char[] charArray2 = str2.toCharArray();
			
			Arrays.sort(charArray1);
			
			Arrays.sort(charArray2);
			
			boolean result = Arrays.equals(charArray1, charArray2);
			
			if(result) {
				System.out.println(str1 + " and "+str2 + " are anagram");
			} else {
				System.out.println(str1 + " and "+str2 + " are  not an anagram");
			}
		} else {
			System.out.println(str1 + " and "+str2 + " are  not an anagram");
		}
		
	}

}

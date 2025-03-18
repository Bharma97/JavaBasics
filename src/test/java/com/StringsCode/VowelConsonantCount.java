package com.StringsCode;

public class VowelConsonantCount {

	public static void main(String[] args) {
		vowelConsonantCount("Hellow world");

	}

	static void vowelConsonantCount(String str) {
		int vowel=0;
		int consonant=0;
		
		str = str.toLowerCase();
		
		for (int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch =='a' || ch=='e'|| ch== 'i'|| ch=='o' || ch=='u' ) {
				
				vowel++;
				
			} else {
				consonant++;
			}
		}
		
		System.out.println("vowel count is: "+vowel+ " consonant count is: "+consonant);
	}
}

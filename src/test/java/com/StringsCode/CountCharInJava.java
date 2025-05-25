package com.StringsCode;

public class CountCharInJava {

	public static void main(String[] args) {

		
		String name = "Bharmagowda";
		int count=0;
		
		//name= "Java programming java oops"
		
		for(int i=0; i<+name.length();i++) {
			char ch = name.charAt(i);
//			System.out.println(ch);
			if (ch=='a'||ch=='A') { // || is an OR operator
//				count = count+1;
				count++;
			}
		}
		System.out.println(count);
	}

}

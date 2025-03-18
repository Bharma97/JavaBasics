package com.StringsCode;

import org.testng.annotations.Test;

public class ReverseString {

	public  static void main(String args[]) {
	String first = "Bharma";
	String afterReverse = "";
	
	for (int i=0; i<first.length(); i++ ) {
		char ch= first.charAt(i); 
		afterReverse = ch + afterReverse;
	}
	System.out.println(afterReverse);
	}
	
}

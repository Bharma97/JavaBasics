package com.StringsCode;

public class ReplaceOvells {
	
	public static void main(String args[]) {
	
	String name = "BharmagowdaBS";
	
	String replacedString = name.replaceAll("[aeiouAEIOU]", "x");
	
	System.out.println("After replace ovells with X: " + replacedString);
	}
}

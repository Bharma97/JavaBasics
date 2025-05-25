package com.StringsCode;

public class abcdToaabbccdd {
	
	 public static void main(String[] args) {
		 
	        String str ="abcd";
	        
	        StringBuilder result = new StringBuilder();
	        
	        for(int i=0; i<str.length(); i++){
	            char ch = str.charAt(i);
	            result.append(ch).append(ch);
	        }
	        
	        System.out.println(result);
	        
	}
}

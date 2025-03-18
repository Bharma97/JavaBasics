package com.interviewQuestions;

public class ReplaceStringInOccurence {
	
	  public static void main(String[] args) {
		  
	        // Input string
	        String input = "Go to Joho";
	        
	        // StringBuilder to store the modified string
	        StringBuilder result = new StringBuilder();
	        
	        // Variable to count occurrences of 'o'
	        int oCount = 0;
	        
	        // Iterate over each character in the input string
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            
	            // If the character is 'o', replace it with dollar signs
	            if (ch == 'o') {
//	                oCount++; // Increment the count for 'o'
//	                for (int j = 0; j < oCount; j++) {
	                    result.append('$');
//	                }
	            } else {
	                // If the character is not 'o', just append it as it is
	                result.append(ch);
	            }
	        }
	        
	        // Print the resulting string
	        System.out.println("Output String: " + result.toString());
	    }
}

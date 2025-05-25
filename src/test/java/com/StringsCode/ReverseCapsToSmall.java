package com.StringsCode;

public class ReverseCapsToSmall {

	/*
	 * If the character is upper case (between 'A' and 'Z'), it converts it to lower case 
	 * by adding 32 (the ASCII difference between upper case and lower case letters).
		If the character is lower case (between 'a' and 'z'),
	    it converts it to upper case by subtracting 32.
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
	/*
	 *  String input = "HeLloWorLD123@#";
        String result = swapCase(input);

        System.out.println("Original: " + input);
        System.out.println("Swapped Case: " + result);
    }

    public static String swapCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch); // Keep digits and special characters as-is
            }
        }

        return result.toString();
    }
	 */
}

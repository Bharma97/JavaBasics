package com.StringsCode;

import java.util.HashMap;

public class CountDupChars {

	public static void main(String[] args) {

		  String name = "Bharmagowda came from home";
		  countDuplicateCharacters(name);
		  
	}

	public static void countDuplicateCharacters(String str) {		   
              
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        
        for(HashMap.Entry<Character, Integer> entry : map.entrySet()){
           if (entry.getValue() > 1 && entry.getKey()!=' ') {
                System.out.println(entry.getKey()
                                   + " : "
                                   + entry.getValue());
            }
        }
        
	}

}

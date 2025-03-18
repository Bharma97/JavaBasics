package com.StringsCode;

import java.util.HashMap;

public class CountOccurenceOfEachChar {

	public static void main(String[] args) {
		
		countOccurenceOfEachChar("Java Automation Test Automation");

	}

	static void countOccurenceOfEachChar(String str) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String[] txt = str.split(" ");
		for (String s : txt) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			} else {
				map.put(s, 1);
			}
		}
		System.out.println("The number of characters in given string is "+ map);
	}
}

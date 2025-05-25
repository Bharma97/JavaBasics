package com.NumbersCode;

import java.util.*;

public class FindNonRepeatElements {
	
	public static void main(String[] args) {
		
		int[] num = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
		
		Map<Integer, Integer> map = new HashMap<>();
		 // Step 1: Count occurrences of each element using a HashMap
		
		for(int count:num) {
			map.put(count, map.getOrDefault(count, 0)+1);
			
		}
		List<Integer> result = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet() ) {
			if (entry.getValue()==1) {
				result.add(entry.getKey());
			}
		}
		
		System.out.println(result);
	} 
	/*
	 public static void main(String[] args) {
	        int[] inputArray = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
	        List<Integer> uniqueElements = findUniqueElements(inputArray);

	        System.out.println("Unique elements: " + uniqueElements);
	    }

	    public static List<Integer> findUniqueElements(int[] array) {
	        // Step 1: Count occurrences of each element using a HashMap
	        Map<Integer, Integer> elementCount = new HashMap<>();
	        for (int num : array) {
	            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
	        }

	        // Step 2: Collect elements that appear exactly once
	        List<Integer> result = new ArrayList<>();
	        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
	            if (entry.getValue() == 1) {
	                result.add(entry.getKey());
	            }
	        }

	        return result;
	    }*/
}

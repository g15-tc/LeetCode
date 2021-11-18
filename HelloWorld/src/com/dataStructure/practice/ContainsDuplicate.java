package com.dataStructure.practice;

import java.util.*;

public class ContainsDuplicate {
	private Map<Integer, Integer> memo = new HashMap<>();
	
    public boolean containsDuplicate(int[] nums) {
    	for (int i : nums)
    	{
    		memo.put(i, memo.getOrDefault(i, 0)+1);
    	}
    	
    	for(int k : memo.keySet())
    	{
    		if(memo.get(k) >= 2)
    		{
    			return true;
    		}
    	}
    	return false;
    }
}

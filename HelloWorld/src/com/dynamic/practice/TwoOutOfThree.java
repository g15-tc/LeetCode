package com.dynamic.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoOutOfThree {
	private Map<Integer, Integer> memo = new HashMap<>();
	private Map<Integer, Integer> memo2 = new HashMap<>();
	private Map<Integer, Integer> memo3 = new HashMap<>();
	private Map<Integer, Integer> memo4 = new HashMap<>();
	
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<Integer>();
    	for(int i : nums1)
    	{
    		memo.put(i, 1);
    	}
    	
    	for(int j : nums2)
    	{
        	memo2.put(j, 1);
    	}
    	
    	for (int k : nums3)
    	{
        	memo3.put(k, 1);
    	}
    	
    	for (int n : memo.keySet())
    	{
    		memo4.put(n,1);
    	}
    	
    	for (int m : memo2.keySet())
    	{
    		if(memo4.containsKey(m))
    		{
    			memo4.put(m,2);
    		}
    		else
    		{
    			memo4.put(m,1);
    		}
    	}
    	
    	for (int b : memo3.keySet())
    	{
    		if(memo4.containsKey(b))
    		{
    			memo4.put(b,2);
    		}
    	}
    	
    	for (int v : memo4.keySet())
    	{
    		if(memo4.get(v)==2)
    		{
    			list.add(v);
    		}
    	}
    	
    	return list;
    }
}

package com.dynamic.practice;

public class MinimumOperations {

    public int minimumOperations(int[] nums, int start, int goal) {
    	int count = 0;
    	int difference = goal - start;
    	
    	for (int i = 0; i < nums.length; i ++)
    	{
        	int xOrDiff = difference ^ nums[i];
        	if(xOrDiff == nums[i])
        	{
        		count ++;
        	}
    	}

    	if(difference > )
    	return count;
        
    }
}

package com.leetcode.easy;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    
    public int longestConsecutive(int[] nums)
    {
    	int result = 0;
    	int temp = 0;
    	Arrays.sort(nums);
    	for(int i =0; i<nums.length -1; i++)
    	{
    		if(nums[i] + 1 == nums[i+1])
    		{
    			temp ++;
    		}
    		else if (nums[i] == nums[i+1])
    		{
    			
    		}
    		else
    		{
    			temp = 0;
    		}
    		result = Math.max(result, temp);
    	}
    	if(nums.length == 0)
    	{
    		return result = 0;
    	}
    	return result + 1;
    }
}

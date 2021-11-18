package com.dataStructure.practice;

public class SmallestEqual {
    public int smallestEqual(int[] nums) 
    {
        for(int i = 0; i < nums.length; i ++)
        {
        	int remainder = i % 10;
        	if(remainder == nums[i])
        	{
        		return i;
        	}
        }
        return 0;
    }
}

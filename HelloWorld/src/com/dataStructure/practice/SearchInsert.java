package com.dataStructure.practice;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
    	for(int i = 0 ; i < nums.length; i ++)
    	{
    		if(nums[i] >= target) 
    		{
    			if(i == 0)
    			{
    				return 0;
    			}
    			return i;
    		}
            else if (i == (nums.length - 1))
            {
                return i + 1;
            }
    	}
    	return 0;
    }
}

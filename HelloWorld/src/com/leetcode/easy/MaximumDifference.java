package com.leetcode.easy;

import java.util.*;

public class MaximumDifference {
    public static int maximumDifference(int[] nums) {

    	if(nums.length ==0)
    	{
    		return -1;
    	}
    	int tempMax = -1;

    	int [] arr = new int [nums.length];
    	Arrays.fill(arr, -1);

    	for (int i = 0; i < nums.length; i++)
    	{
    		for(int j = i + 1; j < nums.length; j ++)
    		{
    			if(nums[i] < nums[j])
    			{
    				tempMax = Math.max(tempMax, nums[j] - nums[i]);
    			}
    		}
    		arr[i] = tempMax;
    	}
    	
    	int max = -1;
    	for (int k = 0; k < arr.length; k++)
    	{
    		max = Math.max(max, arr[k]);
    	}
    	return max;
    }
}

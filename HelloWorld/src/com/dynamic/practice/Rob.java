package com.dynamic.practice;

import java.util.*;

public class Rob {
	public int robCircle (int[] nums)
	{
		if(nums.length == 1)
		{
			return nums[0];
		}
		int resultFirst = rob(Arrays.copyOfRange(nums, 0, nums.length-1));
		int resultLast = rob(Arrays.copyOfRange(nums, 1, nums.length));
		return Math.max(resultFirst, resultLast);
	}
	
	public int rob(int[] nums) {
		if(nums.length ==0)
			return 0;
		
		int [] arr = new int [nums.length + 1];
		Arrays.fill(arr,0);

		arr[0] = 0;
		arr[1]= nums[0];

		for(int i = 2; i< arr.length; i++)
		{
			arr[i] = Math.max(arr[i-1], arr[i-2] + nums[i-1]);
		}

		return arr[arr.length-1];
	}
}

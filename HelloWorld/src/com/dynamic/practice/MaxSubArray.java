package com.dynamic.practice;

import java.util.*;

public class MaxSubArray {
	public int maxSubArray(int[] nums) {
		
		int [] arr = new int [nums.length + 1];
		Arrays.fill(arr, 0);
		int max =  nums[0];

		arr[0] = nums[0];

		for (int i = 1; i < nums.length; i++)
		{
			arr[i] = Math.max(nums[i], arr[i-1]+nums[i]);
			max = Math.max(max, arr[i]);
		}
		
		return max;
	}
}

package com.dynamic.practice;

import java.util.*;

public class CanJump {
	public int CanJumpMin (int [] nums)
	{
        if(nums.length <= 1)
		{
			return 0;
		}

		int [] arr = new int [nums.length];
		Arrays.fill(arr, 0);
		
		arr[1] = 1;

		for (int i = 0; i < nums.length; i ++)
		{
			for(int j = 1; j <= nums[i]; j++)
			{
				if(i+j < arr.length)
				{
					if(arr[i+j] == 0)
					{
						arr[i+j] = arr[i] + 1;
					}
					else
					{
						arr[i+j] = Math.min(arr[i+j], arr[i]+1);
					}
				}
			}
		}
		return arr[arr.length-1];
	}

	public boolean canJump(int[] nums) {
		if(nums.length <= 1)
		{
			return true;
		}
		boolean [] arr = new boolean [nums.length];
		Arrays.fill(arr, false);

		arr[0] = true;

		for (int i = 0; i < nums.length; i ++)
		{
			if(arr[i] == true)
			{
				for(int j = 0; j <= nums[i]; j++)
				{
					if(i+j < arr.length)
					{
						arr[i+j] = true;
					}
				}
			}
		}

		return arr[arr.length-1];
	}
}

package com.leetcode.easy;
import java.util.*;

public class SetMismatch {

	public int[] findMismatch (int[] nums)
	{
		Map<Integer, Integer> map = new HashMap<>();
		int [] result =  {0,0};

		for(int i:nums)
		{
			map.put(i, map.getOrDefault(i, 0) +1);
		}

		for (int i = 1; i <= nums.length ; i ++)
		{
			if(map.containsKey(i))
			{
				if(map.get(i) == 2)
				{
					result[0] = i;
				}
			}
			else
			{
				result[1] = i;
			}

		}
		return result;
	}
}

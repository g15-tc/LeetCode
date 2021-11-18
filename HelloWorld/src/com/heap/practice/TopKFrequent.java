package com.heap.practice;

import java.util.*;

public class TopKFrequent {
	public int[] topKFrequent(int[] nums, int k) {
		if(nums.length == 1)
		{
			return nums;
		}

		Map<Integer, Integer> memo = new HashMap<>();

		for (int i : nums)
		{
			memo.put(i, memo.getOrDefault(i,0) + 1);
		}

		PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2)->memo.get(n1)-memo.get(n2));

		for(int i : memo.keySet())
		{
			heap.add(i);
			if(heap.size() > k)
			{
				heap.poll();
			}
		}

		int [] result = new int [k];
		for (int j = 0; j < result.length; j ++)
		{
			result[j] = heap.poll();
		}
		return result;
	}
}

package com.dynamic.practice;

import java.util.HashMap;
import java.util.Map;

public class MinOperations {
	private Map<Integer, Integer> memo = new HashMap<>();
	public int minOperations(int[][] grid, int x) {
		int difference = 0;
		int temp = 0;
		int anchor = 0;

		if(grid.length == 1 && grid[0].length == 1)
		{
			return 0;
		}

		int min = Integer.MAX_VALUE;
		for(int l1 = 0; l1< grid.length; l1 ++)
		{
			for(int m1 = 0; m1< grid[0].length; m1 ++)
			{
				anchor = grid[l1][m1];
				int moves = 0;
				if(memo.containsKey(anchor))
				{
					moves =  memo.get(anchor);
				}
				else
				{
					for(int l = 0; l< grid.length; l ++)
					{
						for(int m = 0; m< grid[0].length; m ++)
						{
							difference = anchor - grid[l][m];
							if(difference % x != 0)
							{
								return -1;
							}
							moves = moves + Math.abs(anchor - grid[l][m])/x;
						}
					}
				}
				min = Math.min(min, moves);
				memo.put(anchor, min);
			}
		}

		return min;
	}
}

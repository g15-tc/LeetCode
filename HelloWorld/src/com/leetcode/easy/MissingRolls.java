package com.leetcode.easy;

import java.util.*;
import java.util.stream.IntStream;

public class MissingRolls {
	public int[] missingRolls(int[] rolls, int mean, int n) {
		int [] arr = new int [n];
		int totalNum = rolls.length + n;
		int totalSum = mean * totalNum;
		int rollsSum = IntStream.of(rolls).sum();
		int remainder =  totalSum - rollsSum;
		Arrays.fill(arr, 1);		
		
		remainder -= n;
		if(remainder < 0)
		{
			return new int [0];
		}
		
		if(remainder == 0)
		{
			return arr;
		}

		if(remainder <= n*5)
		{
			for(int k =  0 ; k < n; k++)
			{
				if(remainder > 0)
				{
					if(remainder <= 5)
					{
						arr[k] = arr[k]+remainder;
						remainder = 0;
					}
					else
					{
						arr[k] = 6;
						remainder -= 5;
					}
				}
			}
		}
		else
		{
			return new int[0];
		}

		return arr;
	}
}

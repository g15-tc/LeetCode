package com.leetcode.easy;

public class CandyCount {

	public int[] candyDist(int candies, int people)
	{
		int count = 0;
		int index = 0;
		int [] candyList = new int [people];
		
		while(candies > 0)
		{
			count ++;
			if(candies <= count)
			{
				candyList[index] += candies;
			}
			else 
			{
				candyList[index] += count;
			}
			candies -= count;
			index ++;
			if (index > people)
			{
				index = 0;
			}
		}
		return candyList;
	}
}

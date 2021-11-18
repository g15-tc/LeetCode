package com.leetcode.easy;
import java.util.*;

public class PaintedHouse {

	private int [][] costs;
	private Map<String, Integer> dictionary;

	public int minCost(int[][] costs) 
	{
		int cost = 0;
		if(costs.length == 0)
		{
			cost = 0;
		}
//		this.costs = costs;
//		this.dictionary = new HashMap<>();
//		cost = Math.min(estimateCost(0, 0), Math.min(estimateCost(0, 1), estimateCost(0,2)));
		for(int i = costs.length -2; i >= 0; i--)
		{
			costs[i][0] = costs[i][0] + Math.min(costs[i+1][1], costs[i+1][2]);
			costs[i][1] = costs[i][1] + Math.min(costs[i+1][0], costs[i+1][2]);
			costs[i][2] = costs[i][2] + Math.min(costs[i+1][0], costs[i+1][1]);
		}

		cost = Math.min(costs[0][0], Math.min(costs[0][1], costs[0][2]));
		
		return cost;
	}

	public int estimateCost(int house, int startingColor)
	{
		if(dictionary.containsKey(getKey(house, startingColor)))
		{
			return dictionary.get(getKey(house, startingColor));
		}
		int result = costs[house][startingColor];
		if(house == costs.length -1)
		{

		}
		else if (startingColor == 0)
		{
			result += Math.min(estimateCost(house + 1, 1), estimateCost(house + 1, 2));
		}
		else if (startingColor == 1)
		{
			result += Math.min(estimateCost(house + 1, 0), estimateCost(house + 1, 2));
		}
		else if (startingColor == 2)
		{
			result += Math.min(estimateCost(house + 1, 0), estimateCost(house + 1, 1));
		}

		dictionary.put(getKey(house, startingColor), result);
		
		return result;
	}
	
	private String getKey(int house, int startingColor)
	{
		return String.valueOf(house) + " " + String.valueOf(startingColor);
	}
}

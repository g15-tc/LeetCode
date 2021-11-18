package com.dynamic.practice;

public class MaxProfit {
	public int maxProfit(int[] prices) 
	{
		if(prices.length ==1)
		{
			return 0;
		}

		int tempMin = prices[0];
		int tempMax = prices[1];
		int max = 0;

		for (int i = 1; i < prices.length; i++)
		{
			if(prices[i] < tempMin)
			{
				tempMin = prices[i];
				tempMax = 0;
			}
			else
			{
				tempMax = prices[i] - tempMin;
				max = Math.max(max, tempMax);
			}
		}
		return max;    	
	}

	public int maxProfit2(int[] prices)
	{
		if(prices.length == 1)
		{
			return 0;
		}

		int [] arr = new int [prices.length+1];
		arr[0] =  0;
		int max = 0;
		int sum = 0;
		int tempMin = prices[0];

		for(int i = 1; i < arr.length; i ++)
		{
			if(i == arr.length -1)
			{
				if(arr[i-1] != 0)
				{
					return sum += max;
				}
				else if(sum == 0)
				{
					return max;
				}
				else
				{
					return sum;
				}
			}
			if(prices[i] < prices[i-1])
			{
				sum = sum + max;
				tempMin = prices[i];
				arr[i] = 0;
				max = 0;
			}
			else
			{
				arr[i] = Math.max(prices[i]-tempMin, arr[i-1]);
				max = Math.max(arr[i-1], arr[i]);
			}
		}

		return sum;
	}
}

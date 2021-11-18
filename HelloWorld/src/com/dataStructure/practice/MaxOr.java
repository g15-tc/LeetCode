package com.dataStructure.practice;

public class MaxOr {

	public int countMaxOrSubsets(int[] nums) {
		int maxOr = 0;

		for(int i = 0; i < nums.length; i ++)
		{
			maxOr |= nums[i];
		}

		int n=nums.length;
		int tempOr = 0;
		int result = 0;
		for (int i=0; i <n; i++) //This loop will select start element
		{
			for (int j=i; j<n; j++)   //This loop will select end element
			{
				for (int k=i; k<=j; k++) //This loop will print element from start to end
				{
					tempOr |= nums[k];
					System.out.print(nums[k] + " ");
				}
				System.out.println();
				if(tempOr == maxOr)
				{
					result ++;
					tempOr = 0;
				}
			}
		}
		return result;
	}
}

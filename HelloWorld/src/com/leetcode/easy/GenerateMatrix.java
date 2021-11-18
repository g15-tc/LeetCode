package com.leetcode.easy;

public class GenerateMatrix {
	public int[][] generateMatrix(int n)
	{
		int [][] arr = new int [n][n];
		int count = 1;
		int loop = n;			
		int current = 0;
		
		for(int i = 0 ; i < loop; i ++)
			{
				arr [i][n - loop] = count;
				count ++;
				current = i;
			}
		
		loop --;
		
		while(loop > 0)
		{

			int ways = 0;

			
			for (int j = n-loop; j < loop; j++)
			{
				arr [current][j] = count;
				count ++;
			}
			
			for (int k = loop - 1; k >= 0; k--)
			{
				arr[k][loop] = count;
				count ++;
			}
			
			loop --;
			
			for (int h = loop; h > 0; h--)
			{
				arr[ways][h] = count;
				count ++;
			}
			ways ++;
		}
		
		return arr;
	}
}

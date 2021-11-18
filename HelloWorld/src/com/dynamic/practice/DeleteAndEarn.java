package com.dynamic.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int [] arr = new int [10001];
        Arrays.fill(arr, 0);
        int tempPoints = 0;
        int previous = 0;
        int maxPoints = 0;
        
        for (int i : nums)
        {
        	arr[i]++;
        }
        
        for (int j = 1; j< arr.length; j++)
        {
        	int start =  Math.max(tempPoints, maxPoints);
        	if(previous != j - 1)
        	{
        		maxPoints = arr[j] * j + start;
        		tempPoints = start;
        	}
        	else
        	{
        		maxPoints = arr[j] * j + tempPoints;
        		tempPoints = start;
        	}
        	previous = j;
        }
        
        return Math.max(tempPoints, maxPoints);
    }
}

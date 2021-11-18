package com.dynamic.practice;
import java.util.*;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
    	int [] arr = new int [cost.length + 1];
    	Arrays.fill(arr, 0);
    	
        for(int i = 2; i < cost.length + 1; i ++)
        {
        	arr[i] = Math.min(arr[i-1] + cost[i-1], arr[i-2] + cost[i-2]);
        }
        return arr[arr.length-1];
    }
}

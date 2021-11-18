package com.dynamic.practice;

public class MaxScoreSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        int [] arr = new int [values.length];
        arr[0] = values[0];
        arr[1] = values[1] + values[0] -1;
        
        int result = values[1] + values[0] -1;
        if(values.length == 2)
        {
        	return result;
        }
        
        for(int i = 2; i < values.length; i ++)
        {
        	arr[i] = Math.max(values[i] + values[i-1] - 1, arr[i-1] - values[i-1] + values[i] -1);
        	result = Math.max(result, arr[i]);
        }
        return result;
    }
}

package com.dynamic.practice;
import java.util.*;

public class ClimbStairs {
	private Map<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
    	if(memo.containsKey(n))
    	{
    		return memo.get(n);
    	}
        if(n == 0)
        {
        	memo.put(n, 1);
        	return memo.get(n);
        }
        else if (n < 0)
        {
        	memo.put(n, 0);
        	return memo.get(n);
        }
        
        memo.put(n, climbStairs(n-1) + climbStairs(n-2));
        return memo.get(n);
    }
}

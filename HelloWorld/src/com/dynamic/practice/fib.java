package com.dynamic.practice;

import java.util.*;

public class fib {
	private Map<Integer, Integer> memo = new HashMap<>();
	
	public int fibonacci(int n)
	{
		if(memo.containsKey(n))
		{
			return memo.get(n);
		}
		int result;
		if (n == 0)
		{
			result = 0;
			memo.put(n, result);
			return memo.get(n);
		}
		else if (n == 1)
		{
			result = 1;
			memo.put(n, result);
			return memo.get(n);
		}
		
		memo.put(n, result = fibonacci(n-1) + fibonacci(n-2));
		return memo.get(n);
	}
}

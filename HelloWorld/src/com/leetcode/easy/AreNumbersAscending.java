package com.leetcode.easy;

public class AreNumbersAscending {
    public boolean areNumbersAscending(String s) {
    	s = s.replaceAll("[^-?0-9]+", " ");
    	s = s.trim();
        String [] digits = s.split("\\D+");
        int [] num = new int [digits.length];
        for(int i =0; i < digits.length; i ++)
        {
        	num[i] = Integer.parseInt(digits[i]);
        }
        
        for(int j = 0; j < num.length - 1; j ++)
        {
        	if(num[j] >= num[j+1])
        	{
        		return false;
        	}
        }
        return true;
    }
}

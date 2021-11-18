package com.leetcode.easy;
import java.math.BigInteger;
import java.util.*;

public class LargestOddNumber {
	
    public String largestOddNumber(String num) {
    	int temp;
    	String tempString = "";
    	
    	for(int i = num.length(); i > 0 ; i --)
    	{
    		tempString = num.substring(i - 1, i);
    		temp = Integer.parseInt(tempString);
    		if(temp%2 == 1)
    		{
    			return String.valueOf(num.substring(0, i));
    		}
    		else
    		{
    			tempString = "";
    		}
    	}
		return tempString;
    }
}

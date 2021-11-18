package com.leetcode.easy;
import java.util.*;

public class MinimumMoves {
    public int minimumMoves(String s) {
        int result = 0;
        
        for(int i = 0; i < s.length(); i ++)
        {
        	if(s.charAt(i) == 'X')
        	{
        		result ++;
        		i += 2;
        	}
        }
        return result;
    }
}

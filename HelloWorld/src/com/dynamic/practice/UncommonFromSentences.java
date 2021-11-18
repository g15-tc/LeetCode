package com.dynamic.practice;

import java.util.*;

public class UncommonFromSentences {
    private Map <String, Integer> memo = new HashMap<>();
	public String[] uncommonFromSentences(String s1, String s2) {

        String [] s1Words = s1.split("\\W+");
        String [] s2Words = s2.split("\\W+");
        
        for(int i = 0; i < s1Words.length; i ++)
        {
        	memo.put(s1Words[i], memo.getOrDefault(s1Words[i], 0) + 1);
        }
        
        for(int j = 0; j < s2Words.length; j ++)
        {
        	memo.put(s2Words[j], memo.getOrDefault(s2Words[j], 0) + 1);
        }
        
        int index = 0;
        for(String k : memo.keySet())
        {
        	if(memo.get(k) == 1)
        	{
        		index ++;
        	}
        }
        
        String [] result = new String [index];
        Arrays.fill(result, null);
        index = 0;
        for(String k : memo.keySet())
        {
        	if(memo.get(k) == 1)
        	{
        		result[index] = k;
        		index ++;
        	}
        }

        return result;
    }
}

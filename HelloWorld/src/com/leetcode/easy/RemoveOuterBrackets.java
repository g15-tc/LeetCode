package com.leetcode.easy;

public class RemoveOuterBrackets {

	public String processString (String s)
	{
		int layer = 0;
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < s.length() - 1; i ++)
		{
			if(s.charAt(i) == '(')
			{
				layer ++;
				if(layer > 1)
				{
					result = result.append(s.charAt(i));
				}
			}
			else if(s.charAt(i) == ')')
			{

		 		layer --;
		 		if(layer >= 1)
				{
					result = result.append(s.charAt(i));
				}
			}

		}
		return result.toString();
	}
}

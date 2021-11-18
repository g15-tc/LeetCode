package com.dataStructure.practice;

import java.util.HashMap;
import java.util.Map;

public class CountVowelSubstrings {
	private Map <String, Integer> memo = new HashMap<>(); 
	public int countVowelSubstrings(String word) {
		int result = 0;
		String regex = "([^aeiouAEIOU0-9\\W]+)";
		for(int i = 0; i < word.length(); i ++)
		{
			for(int j = i+1; j <= word.length(); j++)
			{
				String tempStr = word.substring(i, j);
				String conStr = tempStr.replaceAll(regex, "");
				if(tempStr.length() == conStr.length())
				{
					if(tempStr.contains("a") && tempStr.contains("e") && tempStr.contains("i") && tempStr.contains("o") && tempStr.contains("u"))
					{
						result ++;
					}
				}

			}
		}
		return result;
	}

	public int countVowels(String word) {
		int result = 0;
		int temp = 0;
		String regex = "([^aeiouAEIOU0-9\\W]+)";
		for(int i = 0; i < word.length(); i ++)
		{
			for(int j = i+1; j <= word.length(); j++)
			{
				String tempStr = word.substring(i, j);
				if(memo.containsKey(tempStr))
				{
					result += memo.get(tempStr);
				}
				else
				{
					String tempStr2 = tempStr.replaceAll(regex, "");
					result += tempStr2.length();
					memo.put(tempStr, tempStr2.length());
				}
			}
		}
		return result;
	}
}

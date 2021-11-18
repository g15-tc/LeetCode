package com.leetcode.easy;

public class isInterweaveString {
	public boolean interleaveString(String s1, String s2, String s3)
	{
		if(s3.length() != s1.length() + s2.length())
		{
			return false;
		}
        else if (s1.length() == 0 && s2.equals(s3))
        {
            return true;
        }
        else if (s2.length() == 0 && s1.equals(s3))
        {
            return true;
        }
        else if (s1.length() == 0 && !s2.equals(s3))
        {
            return false;
        }
        else if (s2.length() == 0 && !s1.equals(s3))
        {
            return false;
        }
		boolean [][] stringArray = new boolean [s2.length() + 1][s1.length() + 1];
		for (int i = 0; i <= s2.length(); i++)
		{
			for (int j = 0; j <= s1.length(); j++)
			{
				if(i == 0 &&  j == 0)
				{
					stringArray[i][j] = true;
				}
				else if(i == 0)
				{
					stringArray[i][j] = stringArray[i][j - 1] && s1.charAt(j - 1) == s3.charAt(i + j - 1);
				}
				else if(j == 0)
				{
					stringArray[i][j] = stringArray[i - 1][j] && s2.charAt(i - 1) == s3.charAt(i + j - 1);
				}
				else
				{
					stringArray[i][j] = (stringArray[i][j - 1] && s1.charAt(j - 1)==s3.charAt(i + j - 1)) || (stringArray[i - 1][j] && s2.charAt(i - 1) == s3.charAt(i + j - 1));
				}
			}
		}
		return stringArray[s2.length()][s1.length()];
	}
}

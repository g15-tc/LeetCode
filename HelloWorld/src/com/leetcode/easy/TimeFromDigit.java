package com.leetcode.easy;

public class TimeFromDigit {
	public String largestTimeFromDigits(int[] arr) {
		int [] digits = new int [10];
		StringBuilder s = new StringBuilder();
		for (int i : arr)
		{
			digits[i]++;
		}

		for(int j = 2; j != 0; j--)
		{
			if(digits[j] > 0)
			{
				s.append(j);
				digits[j]--;
				break;
			}
		}

		if(s.charAt(0) == '2')
		{
			for(int k = 3; k != 0; k--)
			{
				if(digits[k] > 0)
				{
					s.append(k);
					digits[k]--;
					break;
				}
			}
		}
		else
		{
			for(int k = 9; k != 0; k--)
			{
				if(digits[k] > 0)
				{
					s.append(k);
					digits[k]--;
					break;
				}
			}
		}



		s.append(':');

		for(int l = 5; l != 0; l--)
		{
			if(digits[l] > 0)
			{
				s.append(l);
				digits[l]--;
				break;
			}
		}

		for(int z = 9; z != 0; z--)
		{
			if(digits[z] > 0)
			{
				s.append(z);
				digits[z]--;
				break;
			}
		}

		return s.toString();
	}
}

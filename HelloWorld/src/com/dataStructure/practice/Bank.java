package com.dataStructure.practice;

import java.util.*;

public class Bank {
	int num;
	long [] memo;

	public Bank(long[] balance) {
		num = balance.length;
		memo = new long [num];
		for(int i = 0; i < balance.length; i ++)
		{
			memo[i] = balance[i];
		}
	}

	public boolean transfer(int account1, int account2, long money) {
		boolean result = false;
		if((account1 -1 < num && account1 -1>=0) && (account2 -1 < num && account2 -1>=0))
		{
			result = withdraw(account1, money);
			if(result == true)
			{
				deposit(account2, money);
			}
		}
		return result;
	}

	public boolean deposit(int account, long money) {
		if(account -1 < num && account-1>=0)
		{
			memo[account - 1] = memo[account - 1] + money;
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean withdraw(int account, long money) {
		if(account -1 < num && account-1>=0)
		{
			if(memo[account - 1] >= money)
			{
				memo[account - 1] = memo[account - 1] - money;
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}

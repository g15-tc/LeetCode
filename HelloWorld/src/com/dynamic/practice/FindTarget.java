package com.dynamic.practice;

import java.util.*;

public class FindTarget {
	private Map<Integer, Integer> memo = new HashMap<>();
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public boolean findTarget(TreeNode root, int k) {
		if(root == null)
		{
			return false;
		}

		boolean result = false;
		int difference = 0;
		difference = k - root.val;
		if(memo.containsKey(difference) == true)
		{
			return true;
		}
		else
		{
			memo.put(difference, root.val);
		}

		result = findTarget(root.left, k) || findTarget(root.right, k);

		return result;
	}
}
package com.leetcode.easy;

public class DeleteNode {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	public void deleteNode(ListNode node) {
		ListNode currentNode = node;
		
		while(currentNode.next != null)
		{
			ListNode nextNode = currentNode.next;
			currentNode.val = nextNode.val;
			currentNode.next = nextNode;
			nextNode.next = currentNode.next;
			if(nextNode.next == null)
			{
				currentNode.next = null;
			}
		}
	}
}

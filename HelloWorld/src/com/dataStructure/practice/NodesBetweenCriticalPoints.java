package com.dataStructure.practice;

public class NodesBetweenCriticalPoints {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		public ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public int[] nodesBetweenCriticalPoints(ListNode head) {
		int firstNode = 0;
		int nextNode = 0;
		int currentNode = 0;
		ListNode itr = head;
		int firstIndex = 10000;
		int currentIndex = 0;
		int max = 0;
		int min = 10000;
		int distance = 0;
		int [] result = new int [2];

		while(head.next.next != null)
		{
			firstNode = head.val;
			itr= head.next;
			currentNode = itr.val;
			itr = itr.next;
			nextNode = itr.val;
			if((firstNode > currentNode && currentNode < nextNode) || (firstNode < currentNode && currentNode>nextNode))
			{
				if(firstIndex == 10000)
				{
					firstIndex = currentIndex;
				}
				else
				{
					distance = currentIndex - firstIndex;
					max = Math.max(max, distance);
					min = Math.min(min, distance);
				}
			}

			head = head.next;
			currentIndex ++;
		}

		result[0] = min;
		result[1] = max;
		if(result[0] == 10000)
		{
			result[0] = -1;
			result[1] = -1;
		}

		return result;
	}
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// time: O(nlogk) k is the number of linked lists
// space: O(n)
//one linked list is identical to the first node of the list
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
    /*
        //first method binary sort
        if (lists == null || lists.length == 0) return null;
        return sort(lists, 0, lists.length - 1);
    }
    public ListNode sort(ListNode[] lists, int lo, int hi){
    	if (lo >= hi) return lists[lo];
    	int mid = (hi - lo) / 2 + lo;
    	ListNode l1 = sort(lists, lo, mid);
    	ListNode l2 = sort(lists, mid + 1, hi);
    	return merge(l1, l2);
    }
   	public ListNode merge(ListNode l1, ListNode l2){
   		if (l1 == null) return l2;
   		if (l2 == null) return l1;
   		if (l1.val < l2.val) {
   			l1.next = merge(l1.next, l2);
   			return l1;
   		}
   		l2.next = merge(l2.next, l1);
   		return l2;
   }
   */
   		//use priority queue
   		if (lists == null || lists.length == 0) return null;
   		PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
   		ListNode dummy = new ListNode(0);				//only for creating the first node with val 0
   		ListNode cur = dummy;							//cur and dummy will have the same reference

   		for (ListNode list : lists) {
   			if (list != null) {
   				queue.add(list);
   			}
   		}
   		while (!queue.isEmpty()) {
   			cur.next = queue.poll();
   			cur = cur.next;
   			if (cur.next != null) {
   				queue.add(cur.next);
   			}
   		}			
   		return dummy.next;
	}
}
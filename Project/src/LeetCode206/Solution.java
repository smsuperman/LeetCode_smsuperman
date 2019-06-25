package LeetCode206;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Solution
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode dummy =  new ListNode(0);
        dummy.next = head;
        ListNode pre = head;

        while(pre != null&& pre.next != null){
            ListNode cur = pre.next;
            pre.next = pre.next.next;
            cur.next = dummy.next;
            dummy.next = cur;
        }
        return dummy.next;
    
    }
}
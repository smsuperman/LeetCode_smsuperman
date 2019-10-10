package LeetCode24;

/**
 * Solution
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        

        if(head == null|| head.next == null ){
            return head;
        }
        
        ListNode first = head;
        ListNode second = head.next;
        ListNode node = second.next;
        second.next = first;
        first.next = swapPairs(node);
        
        return second;
    }
}
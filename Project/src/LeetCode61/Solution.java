package LeetCode61;

/**
 * Solution
 */
public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || k==0){
            return head;
        } 

        ListNode tmp = head;
        int len = 0;
        
        while(tmp != null){
            len++;
            tmp = tmp.next;
        }

        

        k = k % len;
        if(k == 0){
            return head;
        }

        ListNode node = head;
        tmp = head;
        while(k>0){
            k--;
            tmp = tmp.next;
        }

        while(tmp.next != null){
            head = head.next;
            tmp = tmp.next;
        }

        ListNode newHead = head.next;
        head.next = null;
        tmp.next = node;
        return newHead;
    }
}
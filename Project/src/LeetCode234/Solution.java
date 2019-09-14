package LeetCode234;

import java.util.Stack;

/**
 * Solution
 */
public class Solution {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

    
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }


        ListNode prev = null;
        ListNode node = null;
        //反转
        while(slow != null){
            node = slow.next;
            slow.next = prev;
            prev = slow;
            slow = node;
        }

        while(head != null && prev != null){
            if(head.val != prev.val){
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
            
        return true;
        
    }
}
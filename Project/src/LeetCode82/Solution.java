package LeetCode82;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Solution
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
       ListNode dummyHead = new ListNode(0);

       dummyHead.next = head;

       ListNode slow = dummyHead;
       ListNode fast = head;

       while(fast != null && fast.next != null){
            if(fast.val == fast.next.val){
                while(fast.next != null && fast.val == fast.next.val){

                    fast = fast.next;
                }
                slow.next = fast.next;   
            }else{
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;

       }

       return dummyHead.next;
    }
}
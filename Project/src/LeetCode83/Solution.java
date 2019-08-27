package LeetCode83;

/**
 * Solution
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;
        
        while(head != null && head.next != null){
            
            if(head.val == head.next.val){
                ListNode temp = head.next;
                head.next = temp.next;
                temp.next = null;
                continue;
            }

            head = head.next;
        }

        return node;
    }
}
package LeetCode141;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        if(head == null || head.next == null){
            return false;
        }

        while(head != null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
            }
            head = head.next;
        }

        return false;
    }
}
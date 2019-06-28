package LeetCode876;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    public ListNode middleNode(ListNode head) {

        List<ListNode> list = new ArrayList<>();
        ListNode node = head;

        while (node != null) {
            list.add(node);
            node = node.next;
        }

        int size = list.size();

       
        return list.get(size / 2);
        
    }
}
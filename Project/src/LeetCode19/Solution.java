package LeetCode19;

import java.util.List;

/**
 * Solution
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode q, p;
        dummy.next = head;
        p = dummy;
        q = dummy;

        for (int i = 0; i < n + 1; i++) {
            q = q.next;
        }

        while (q != null) {
            p = p.next;
            q = q.next;
        }

        ListNode node = p.next;
        p.next = node.next;
        node = null;

        return dummy.next;
    }
}
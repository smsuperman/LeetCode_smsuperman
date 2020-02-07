package LeetCode109;

/**
 * Solution
 */
public class Solution {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return new TreeNode(head.val);
        }

        ListNode pre = head;
        ListNode p = pre.next;
        ListNode q = p.next;

        while (q != null && q.next != null) {
            pre = pre.next;
            p = pre.next;
            q = q.next.next;
        }

        // 分开
        pre.next = null;
        TreeNode root = new TreeNode(p.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(p.next);
        return root;
    }
}
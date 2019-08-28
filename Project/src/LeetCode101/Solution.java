package LeetCode101;

/**
 * Solution
 */
public class Solution {

    public boolean isSymmetric(TreeNode root) {
        return isSame(root, root);
    }

    public boolean isSame(TreeNode l1, TreeNode l2) {
        if (l1 == null && l2 == null) {
            return true;
        }

        if (l1 == null || l2 == null) {
            return false;
        }

        if (l1.val != l2.val) {
            return false;
        }

        return isSame(l1.right, l2.left) && isSame(l1.left, l2.right);
    }
}
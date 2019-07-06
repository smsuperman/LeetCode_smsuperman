package LeetCode104;

/**
 * Solution
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        return getDepth(root, 0);
    }

    private int getDepth(TreeNode root, int length) {
        if (root == null) {
            return length;
        }

        length++;

        int lengthleft = getDepth(root.left, length);
        int leftRight = getDepth(root.right, length);

        if (leftRight > lengthleft) {
            return leftRight;
        } else {
            return lengthleft;
        }
    }
}
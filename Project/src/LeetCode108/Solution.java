package LeetCode108;

/**
 * Solution
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        return build(nums, 0, len);
    }

    public TreeNode build(int[] nums, int l, int r) {
        if (l >= r) {
            return null;
        }

        int m = (r + l) / 2;
        TreeNode node = new TreeNode(nums[m]);
        node.left = build(nums, l, m);
        node.right = build(nums, m + 1, r);

        return node;
    }
}
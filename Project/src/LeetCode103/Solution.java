package LeetCode103;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        order(0, root);
        return list;
    }

    public void order(int depth, TreeNode root) {

        if (root == null) {
            return;
        }

        if (list.size() == depth) {
            list.add(new ArrayList<>());
        }

        if (depth % 2 == 0) {
            list.get(depth).add(root.val);
        } else {
            list.get(depth).add(0, root.val);
        }

        order(depth + 1, root.left);
        order(depth + 1, root.right);
    }
}
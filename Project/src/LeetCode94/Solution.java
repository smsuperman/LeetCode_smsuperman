package LeetCode94;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {


    private List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        
        order(root);
        return list;
    }

    public void order(TreeNode root){
        if(root == null){
            return;
        }
        
        order(root.left);
        list.add(root.val);
        order(root.right);
    }
}
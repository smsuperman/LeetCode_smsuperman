package LeetCode144;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        travel(list, root);
        
        return list;
    }

    public void travel(List<Integer> list,TreeNode root){

        if(root == null){
            return;
        }

        list.add(root.val);
        travel(list, root.left);
        travel(list, root.right);
    }
}
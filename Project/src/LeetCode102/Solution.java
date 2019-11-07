package LeetCode102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Solution
 */
public class Solution {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        
        oreder(0, root);

        return list;
    }

    public void oreder(int depth,TreeNode root){

        if(root == null){
            return;
        }

        if(list.size() == depth){
            list.add(new ArrayList());
        }
        list.get(depth).add(root.val);
        
        oreder(depth+1, root.left);
        oreder(depth+1, root.right);
    }

}
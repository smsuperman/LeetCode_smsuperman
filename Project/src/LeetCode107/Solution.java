package LeetCode107;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import LeetCode107.TreeNode;

/**
 * Solution
 */
public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {


        List<List<Integer>> res = new ArrayList<>();
        order(root,res,0);
        Collections.reverse(res);
        return res;
        
    }

    public List<List<Integer>> order(TreeNode root,List<List<Integer>> list,int height){

        if(root == null){
            return null;
        }
        if(list.size() <= height){
            list.add(new ArrayList<>());
        }

        list.get(height).add(root.val);
        height++;

        order(root.left,list,height);
        order(root.right, list, height);

        return list;
    }
}
package LeetCode257;

import java.util.LinkedList;
import java.util.List;

/**
 * Solution
 */
public class Solution {


    

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> list = new LinkedList<>();
        search(root, "", list);
        return list;
    
    }

    public void search(TreeNode root,String path,LinkedList list){
        if(root != null){
            path = path + Integer.toString(root.val);
            if(root.left == null && root.right == null){
                list.add(path);
            }else{
                path = path + "->";
                search(root.left,path, list);
                search(root.right, path, list);
            }
        }
    }
}
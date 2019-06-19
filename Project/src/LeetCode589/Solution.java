package LeetCode589;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    List<Integer> list = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        each(root);
        return list;
    }

    public void each(Node root) {

        if (root == null) {
            return;
        }

        list.add(root.val);

        for (Node s :root.children){
            each(s);
        }
    }
}

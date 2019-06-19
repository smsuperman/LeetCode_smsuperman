package LeetCode590;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return list;
        }

        for (Node x : root.children) {
            postorder(x);
        }
        list.add(root.val);
        return list;
    }


}

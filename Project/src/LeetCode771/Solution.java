package LeetCode771;

import sun.reflect.generics.tree.Tree;

import javax.crypto.interfaces.PBEKey;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        TreeMap<Object, Integer> map = new TreeMap<>();
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            if (map.containsKey(c)){
                sum = sum + map.get(c);
            }
        }

        return sum;
    }
}
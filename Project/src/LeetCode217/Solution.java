package LeetCode217;

import java.util.TreeMap;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int i : nums) {
            if (!map.containsKey(i)){
                map.put(i,i);
            }else {
                return true;
            }
        }
        return false;
    }
}

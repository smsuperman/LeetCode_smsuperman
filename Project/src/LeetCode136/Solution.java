package LeetCode136;

import java.util.HashMap;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * Solution
 */
public class Solution {

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer s : map.keySet()) {
            if (map.get(s) == 1) {
                return s;
            }
        }

        return -1;
    }
}
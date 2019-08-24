package LeetCode13;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 */
public class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        int size = s.length() - 1;
        for (int i = 0; i < size; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res = res - map.get(s.charAt(i));
            } else {
                res = res + map.get(s.charAt(i));
            }
        }
        
        res = res + map.get(s.charAt(size));
        return res;
    }
}
package LeetCode242;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Solution
 */
public class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                if(map.get(t.charAt(i)) < 0){
                    return false;
                }
            } else {
                
                return false;
            }
        }

        return true;
    }
}
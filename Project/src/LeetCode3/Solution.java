package LeetCode3;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < len; end++) {
            char at = s.charAt(end);
            if(map.containsKey(at)){
                start = Math.max(map.get(at), start);
            }
            ans = Math.max(ans,end - start +1);
            map.put(at, end+1);
        }

        return ans;
    }
}
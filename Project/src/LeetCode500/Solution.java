package LeetCode500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution
 */
public class Solution {

    public String[] findWords(String[] words) {
        String[] strs = new String[] { "QWERTYUIOPqwertyuiop", "ASDFGHJKLasdfghjkl", "ZXCVBNMzxcvbnm" };
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            for (char c : chars) {
                map.put(c, i);
            }
        }

        List<String> list = new ArrayList<>();
        for (String word : words) {
            char[] wordChar = word.toCharArray();
            int line = map.get(wordChar[0]);
            boolean flag = true;
            for (char c : wordChar) {
                if (map.get(c) != line) {
                    flag = false;
                }
            }

            if (flag) {
                list.add(word);
            }
        }

        return list.toArray(new String[list.size()]);

    }
}
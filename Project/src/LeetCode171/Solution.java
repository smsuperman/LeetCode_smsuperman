package LeetCode171;

/**
 * Solution
 */
public class Solution {

    public int titleToNumber(String s) {
        int res = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int num = s.charAt(i) - 'A' + 1;
            res = res * 26 + num;
        }

        return res;
    }
}
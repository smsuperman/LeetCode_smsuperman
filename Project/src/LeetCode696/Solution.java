package LeetCode696;

public class Solution {
    public int countBinarySubstrings(String s) {

        int last = 0;
        int cur = 1;
        int res = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cur++;
            } else {
                last = cur;
                cur = 1;
            }

            if (last >= cur) {
                res++;
            }
        }

        return res;

    }
}
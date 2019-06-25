package LeetCode1021;

import java.util.Stack;

/**
 * Solution
 */
public class Solution {

    public String removeOuterParentheses(String s) {
        if (s == null) {
            return null;
        }

        int left = 0;
        int right = 0;
        int start = 0;

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if ("(".equals(String.valueOf(s.charAt(i)))) {
                left++;
            } else {
                right++;
            }

            if (left == right) {
                result = result.append(s.substring(start+1,i));
                start = i+1;
            }
        }

        return result.toString();
    }
}
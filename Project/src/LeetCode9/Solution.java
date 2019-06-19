package LeetCode9;

import java.util.stream.StreamSupport;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        Integer num = x;
        StringBuilder str = new StringBuilder(num.toString());
        if (str.toString().equals(str.reverse().toString())) {
            return true;
        }

        return false;
    }
}

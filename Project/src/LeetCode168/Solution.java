package LeetCode168;

/**
 * Solution
 */
public class Solution {

    public String convertToTitle(int n) {
        String str = "#ABCDEFGHIJKLMNOBQRSTUVWXYZ";
        char[] c = str.toCharArray();

        StringBuffer buffer = new StringBuffer();

        while (n > 0) {
            if (n % 26 == 0) {
                buffer.append('Z');
                n = n / 26 - 1;
            } else {
                buffer.append(c[n % 26]);
                n = n / 26;
            }
        }

        return buffer.reverse().toString();

    }
}
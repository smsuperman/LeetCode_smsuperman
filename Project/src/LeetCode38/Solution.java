package LeetCode38;

/**
 * Solution
 */
public class Solution {

    public String countAndSay(int n) {

        if (n <= 0) {
            return "";
        }

        String[] person = new String[n];
        person[0] = "1";

        for (int i = 1; i < n; i++) {
            person[i] = convert(person[i - 1]);
        }

        return person[n - 1];
    }

    public String convert(String str) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                ans.append(count).append(str.charAt(i));
                count = 1;
            }
        }

        return new String(ans);
    }
}
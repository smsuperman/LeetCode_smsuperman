package LeetCode28;

/**
 * Solution
 */
public class Solution {

    public int strStr(String haystack, String needle) {

        int needleSize = needle.length();


        if(haystack.equals("") && needle.equals("")){
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {

            if (i + needleSize > haystack.length()) {
                return -1;
            }

            String subStr = haystack.substring(i, i + needleSize);
            if (subStr.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
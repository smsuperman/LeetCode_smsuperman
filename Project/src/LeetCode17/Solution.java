package LeetCode17;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    private String[] letterMap = { " ", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
    };

    private List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.equals(" ")) {
            return list;
        }
        find(digits, 0, "");
        return list;
    }

    private void find(String digits, int index, String s) {
        if (index == digits.length()) {
            list.add(s);
            return;
        }

        Character c = digits.charAt(index);
        String str = letterMap[c - '0'];
        for (int i = 0; i < str.length(); i++) {
            find(digits, index + 1, s + str.charAt(i));
        }
    }

}
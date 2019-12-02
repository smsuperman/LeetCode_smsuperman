package LeetCode22;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res, "", 0, 0,     n);
        return res;
    }

    // count1统计“(”的个数，count2统计“)”的个数
    public void generate(List<String> list, String ans, int count1, int count2, int n) {

        if (count1 > n || count2 > n) {
            return;
        }

        if (count1 == n && count2 == n) {
            list.add(ans);
        }           

        if (count1 >= count2) {
            String ans1 = new String(ans);
            generate(list, ans1 + "(", count1 + 1, count2, n);
            generate(list, ans1 + ")", count1, count2 + 1, n);
        }
    }
}
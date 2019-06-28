package LeetCode682;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Solution
 */
public class Solution {

    public int calPoints(String[] point) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < point.length; i++) {

            final String str = point[i];

            switch (str) {
            case "+":
                Integer lastOne = stack.pop();
                Integer lastTwo = stack.pop();
                Integer newNum = lastOne + lastTwo;
                stack.push(lastTwo);
                stack.push(lastOne);
                stack.push(newNum);
                break;
            case "D":
                Integer s = 0;
                for (Integer x : stack) {
                    s = x;
                }
                Integer newPush = s * 2;
                stack.push(newPush);
                break;
            case "C":
                stack.pop();
                break;
            default:
                stack.push(Integer.parseInt(str));
                break;
            }
        }

        while (!stack.empty()) {
            sum = sum + stack.pop();
        }

        return sum;
    }
}
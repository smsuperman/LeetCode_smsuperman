package LeetCode1047;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Solution
 */
public class Solution {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (!stack.isEmpty()) {
                if (stack.peek() == arr[i]) {
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            } else {
                stack.push(arr[i]);
            }

        }

        StringBuilder builder = new StringBuilder();
        
        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }

        return builder.reverse().toString();
    }
}
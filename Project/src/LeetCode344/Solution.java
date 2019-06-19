package LeetCode344;

public class Solution {
    public void reverseString(char[] s) {
        char a;
        int size = s.length;
        for (int i = 0; i < size; i++) {
            a = s[i];
            s[i] = s[size-1];
            s[size-1] = a;
            size--;
        }
    }
}

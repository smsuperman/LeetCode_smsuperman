package LeetCode905;

public class Solution {
    public int[] sortArrayByParity(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            if (a[start] % 2 == 0) {
                start++;
            } else {
                int tmp = a[start];
                a[start] = a[end];
                a[end] = tmp;
                end--;
            }
        }

        return a;
    }
}
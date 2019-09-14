package LeetCode204;

/**
 * Solution
 */
public class Solution {

    public int countPrimes(int n) {

        boolean[] sum = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!sum[i]) {
                count++;
                for (int j = i + i; j < n; j = j + i) {
                    sum[j] = true;
                }
            }
        }

        return count;
    }
}
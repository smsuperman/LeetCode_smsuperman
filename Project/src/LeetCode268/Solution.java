package LeetCode268;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int res = 0;
        for (int i = 0; i <= nums.length; i++) {
            sum += i;
        }

        for (int i : nums) {
            res +=i;
        }

        return sum-res;
    }
}

package LeetCode1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int n = 0; n < nums.length; n++) {
                if (n == i) {
                    continue;
                }
                if (target == nums[i] + nums[n]) {
                    sum[0] = n;
                    sum[1] = i;
                }
            }
        }
        return sum;
    }
}

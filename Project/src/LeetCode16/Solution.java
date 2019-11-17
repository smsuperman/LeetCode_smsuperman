package LeetCode16;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Solution
 */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int res = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int newSum = nums[l] + nums[r] + nums[i];
                if (Math.abs(newSum - target) < Math.abs(res - target)) {
                    res = newSum;
                }
                if (newSum > target) {
                    r--;
                } else if (newSum < target) {
                    l++;
                } else {
                    return target;
                }
            }
        }
        return res;
    }
}
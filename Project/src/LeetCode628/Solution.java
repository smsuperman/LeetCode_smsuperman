package LeetCode628;

import java.util.Arrays;

public class Solution {


    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0] * nums[1] * nums[nums.length - 1];
        int max = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        if (max > min) {
            return max;
        }
        return min;

    }
}
package LeetCode645;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import LeetCode14.main;
import sun.management.resources.agent;

/**
 * Solution
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        // 防止出现[2,2]的状况，所以默认为1
        int missNum = 1;
        int repeatNum = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                repeatNum = nums[i];

            } else if (nums[i + 1] - nums[i] > 1) {
                missNum = nums[i] + 1;
            }

        }

        int[] resArray = new int[2];
        resArray[0] = repeatNum;
        // 判断缺失的是不是末尾最后一个数，数组从1开始，所以可以用length判断
        resArray[1] = nums[nums.length - 1] != nums.length ? nums.length : missNum;
        return resArray;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findErrorNums(new int[] { 2, 2 });
    }
}
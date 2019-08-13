package LeetCode448;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums == null) {
            return null;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1 || nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i]-1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i+1 != nums[i]) {
                list.add(i+1);
            }
        }
        return list;
    }

    public void swap(int[] arr, int x, int y) {
        int num = arr[x];
        arr[x] = arr[y];
        arr[y] = num;
    }
}
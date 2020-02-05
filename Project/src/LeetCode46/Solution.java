package LeetCode46;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int[] array = new int[nums.length];
        order(res, nums, new ArrayList<>(), array);
        return res;
    }

    public void order(List<List<Integer>> res, int[] nums, ArrayList<Integer> tempList, int[] array) {
        if (tempList.size() == nums.length) {
            res.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (array[i] == 1) {
                continue;
            }
            array[i] = 1;
            tempList.add(nums[i]);
            order(res, nums, tempList, array);
            array[i] = 0;
            tempList.remove(tempList.size() - 1);
        }

    }
}
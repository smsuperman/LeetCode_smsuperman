package LeetCode39;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);
        order(candidates, target, res, 0, new ArrayList<>());
        return res;
    }

    public void order(int[] array, int target, List<List<Integer>> res, int i, ArrayList<Integer> tmpList) {

        if (target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<>(tmpList));
            return;
        }

        for (int start = i; start < array.length; start++) {
            if (target < 0) {
                break;
            }
            tmpList.add(array[start]);
            order(array, target - array[start], res, start, tmpList);
            tmpList.remove(tmpList.size() - 1);
        }
    }
}
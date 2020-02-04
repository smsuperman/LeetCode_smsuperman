package LeetCode40;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        order(res, candidates, target, 0, 0, new ArrayList<Integer>());
        return res;
    }

    public void order(List<List<Integer>> res, int[] array, int target, int i, int tempSum,
            ArrayList<Integer> tempList) {

        if (tempSum == target) {
            res.add(new ArrayList<>(tempList));
            return;
        }

        for (int start = i; start < array.length; start++) {
            if (tempSum + array[start] > target) {
                break;
            }

            if (start > i && array[start] == array[start - 1]) {
                continue;
            }
            tempList.add(array[start]);
            order(res, array, target, start + 1, tempSum + array[start], tempList);
            tempList.remove(tempList.size() - 1);
        }

    }
}
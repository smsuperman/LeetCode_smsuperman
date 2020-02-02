package LeetCode78;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    private List<List<Integer>> array = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        array.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            int size = array.size();

            for (int j = 0; j < size; j++) {
                List<Integer> list = array.get(j);
                List<Integer> tempList = new ArrayList<>(list);
                tempList.add(nums[i]);
                array.add(tempList);
            }

        }

        return array;
    }
}
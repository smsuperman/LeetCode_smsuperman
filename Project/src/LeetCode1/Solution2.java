package LeetCode1;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution2
 */
public class Solution2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i };
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
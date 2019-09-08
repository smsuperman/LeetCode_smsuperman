package LeetCode169;

import java.util.HashMap;

/**
 * Solution
 */
public class Solution {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        if(nums.length == 1){
            return nums[0];
        }

        int len = nums.length;
        int n = len /2;

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);

                if(map.get(num) > n){
                    return num;
                }
            } else {
                map.put(num, 1);
            }
        }
        return 0;
    }
}
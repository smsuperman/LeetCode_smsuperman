package LeetCode219;

import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int size = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(nums[i]) && i-map.get(nums[i])<=k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

}

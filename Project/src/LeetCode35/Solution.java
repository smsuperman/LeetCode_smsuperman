package LeetCode35;

/**
 * Solution
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        
        int len = 0;
        for(int num : nums){
            
            if(target <= num){
                return len;
            }
            len++;
        }

        return len;
    }
}
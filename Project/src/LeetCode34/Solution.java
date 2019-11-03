package LeetCode34;


/**
 * Solution
 */
public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];

        if (nums.length < 0) {
            res[0] = -1;
            res[0] = -1;
            return res;
        }

        res[0] = findFirst(nums, nums.length, target);
        res[1] = findLast(nums, nums.length, target);

        return res;
    }

    public int findFirst(int[] a, int len, int target) {
        if (len < 1) {
            return -1;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {

            int mid = (left + right) / 2;
            if (a[mid] == target && (mid - 1 < 0 || a[mid - 1] != target)) {
                return mid;
            } else if (a[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;  
    }

    public int findLast(int[] a, int len, int target) {
        if (len < 1) {
            return -1;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (a[mid] == target && (mid + 1 >= len || a[mid + 1] != target)) {
                return mid;
            } else if (a[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
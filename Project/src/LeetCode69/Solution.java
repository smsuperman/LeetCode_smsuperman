package LeetCode69;

/**
 * Solution
 */
public class Solution {

    public int mySqrt(int x) {

        if(x == 1 || x == 0){
            return x;
        }


        int start = 1;
        int end = x / 2 + 1;
        int mid = 0;

        while (start <= end) {
            mid = (end + start) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            }
            if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return mid;
    }
}
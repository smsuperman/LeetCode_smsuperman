package LeetCode202;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 */
public class Solution {

    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }

        int sum = 0;
        Set<Integer> set = new HashSet<>();
        while (true) {
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            if(sum == 1){
                return true;
            }
            if(set.contains(sum)){
                return false;
            }else{
                set.add(sum);
                n = sum;
                sum = 0;
            }
            
        }
    }
}
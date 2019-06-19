package LeetCode66;

public class Solution {
    public int[] plusOne(int[] digits) {

        int len = digits.length;
        boolean is = false;

        if (digits[len - 1] + 1 != 10) {
            digits[len - 1] = digits[len - 1] + 1;
            return digits;
        }

        digits[len - 1] = digits[len - 1] + 1;

        for (int i = len - 1; i >= 0; i--) {

            if (is) {
                digits[i] = digits[i] + 1;
            }

            if (digits[i] == 10) {
                digits[i] = 0;
                is = true;
            } else {
                is = false;
            }
        }


        if (digits[0] == 0) {
            int[] res = new int[len + 1];
            res[0] = 1;
            for (int i = 1; i < res.length; i++) {
                res[i] = digits[i-1];
            }

            return res;
        }
        return digits;
    }
}

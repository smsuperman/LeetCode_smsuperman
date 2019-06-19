package LeetCode728;

import java.util.ArrayList;
        import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int n = i;
            int m = n;
            while (n != 0) {
                if (n % 10 == 0 || m % (n % 10) != 0) {
                    break;
                }
                n = n / 10;
            }
            if (n == 0) {
                list.add(i);
            }
        }

        return list;
    }
}
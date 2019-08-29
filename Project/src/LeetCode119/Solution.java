package LeetCode119;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();
        list.add(1);

        if (rowIndex == 0) {
            return list;
        }

        

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(list.get(j - 1) + list.get(j));
            }

            row.add(1);

            list = row;
        }

        return list;
    }
}
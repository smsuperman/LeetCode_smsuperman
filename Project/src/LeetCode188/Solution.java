package LeetCode188;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    public int maxProfit(int k, int[] prices) {
        
        if(prices.length == 0){
            return 0 ;
        }
        
        
		int len = prices.length;
		int sum = 0;

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < len; i++) {
			int max = 0;
			for (int j = i + 1; j < len; j++) {
				if (prices[j] > prices[i]) {
					max = Math.max(prices[j] - prices[i], max);
				}
			}
			list.add(max);
		}

		Collections.sort(list);

		for (int x = 0, l = len - 1; x < k; x++) {
			sum = sum + list.get(l);
			l--;
		}

		return sum;
	}
}
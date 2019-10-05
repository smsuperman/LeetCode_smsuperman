package LeetCode290;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 */
public class Solution {

    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        int len = pattern.length();
        if(strs.length != len){
            return false;
        }


        Map<Character,String> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            Character ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(strs[i])){
                    return false;
                }
            }else{
                if(map.containsValue(strs[i])){
                    return false;
                }
                
                map.put(ch, strs[i]);
            }
        }
        return true;
    }
}
package LeetCode12;

/**
 * Solution
 */
public class Solution {

    public String intToRoman(int num) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String reps[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder str = new StringBuilder();

        for(int i = 0;i<13;i++){
            while(num >= values[i]){
                num = num - values[i];
                str.append(reps[i]);
            }
        }

        return str.toString();
    }
}   
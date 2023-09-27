package check;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] num = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(num));
    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> frequencies = new HashMap<>();
        int half = nums.length/2;

        for (int i = 0; i < nums.length; i++) {
            frequencies.computeIfPresent(nums[i], (k,v) -> ++v);
            frequencies.putIfAbsent(nums[i], 1);
        }
        for (Map.Entry<Integer,Integer> entry : frequencies.entrySet()){
            if (entry.getValue() > half){
                return entry.getKey();
            }
        }
       return -1;
    }

}

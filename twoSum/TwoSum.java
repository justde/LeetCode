package twoSum;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: zhangjd
 * @Date: 2019/4/9 22:50
 * @Description:
 */
public class TwoSum {
    private int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        int temp;
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            Integer integer = hashMap.get(temp);
            if (integer != null && integer!=i) {
                return new int[]{i, hashMap.get(temp)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{3,3};
        int[] ints = twoSum.twoSum(nums, 6);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

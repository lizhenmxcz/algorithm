package com.leezy.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lizhen on 2017/1/4.
 * todo:Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */
public class T1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i< nums.length - 1; i++) {
            if (nums[i] > target) continue;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] > target) continue;
                if (nums[i] + nums[j] == target){
                    int[] ans = {i, j};
                    return ans;
                }
            }
        }
        return null;
    }
    public static int[] twoSumON(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {34,67,2, 7,4, 11, 15,56};
        int target = 6;
        int[] ans = twoSumON(nums, 6);
        System.out.println(ans[0] + " ," + ans[1]);
    }
}

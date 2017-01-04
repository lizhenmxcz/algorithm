package com.leezy.leetcode;

/**
 * Created by lizhen on 2017/1/4.
 * todo:Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 */
public class T1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i< nums.length - 1; i++) {
            if (nums[i] > target) continue;
            else if (nums[i+1] > target){
                continue;
            }
            else {
                if (nums[i] + nums[i+1] == target) {
                    int [] ans = {i, i+1};
                    return ans;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {34,67,2, 7,4, 11, 15,56};
        int target = 26;
        int[] ans = twoSum(nums, 26);
        System.out.println(ans[0] + " ," + ans[1]);
    }
}

package com.example.myproject.leetcode.easy.ninehundred;

/**
 * 905.按奇偶数排序数组
 */
public class Five {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[flag++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                res[flag++] = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        Five five = new Five();
        System.out.println(five.sortArrayByParity(nums));
    }
}

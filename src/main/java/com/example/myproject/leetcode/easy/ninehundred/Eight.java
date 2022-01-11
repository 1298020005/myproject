package com.example.myproject.leetcode.easy.ninehundred;

import java.util.Arrays;

/**
 * 908.最小差值 I
 * 思路
 * ① min + k >= max -k  则 可以为 0
 * ② min + k < max -k  则 最大为max -min - 2*k
 */
public class Eight {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int length = nums.length;
        int max = nums[length - 1], min = nums[0];
        if (min + k >= max - k) {
            return 0;
        } else {
            return max - min - 2 * k;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        Eight eight = new Eight();
        System.out.println(eight.smallestRangeI(nums, 0));
    }
}

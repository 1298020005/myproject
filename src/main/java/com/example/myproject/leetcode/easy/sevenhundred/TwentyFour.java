package com.example.myproject.leetcode.easy.sevenhundred;

import java.util.Arrays;

/**
 * 724.寻找数组的下标
 */
public class TwentyFour {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length ; i++) {
            int temp = (total - nums[i]) / 2;
            if (sum == temp && (total - nums[i]) % 2 == 0) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        TwentyFour twentyFour = new TwentyFour();
        int[] nums = new int[]{-1,-1,0,1,1,0};
        System.out.println(twentyFour.pivotIndex(nums));
    }
}

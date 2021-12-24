package com.example.myproject.leetcode.easy;

/**
 * 最大子数组和
 * 动态规划分治方法都可以解决，可惜我都不知道这是个啥。
 */
public class FiftyThree {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = res > sum ? res : sum;
        }
        return res;
    }

    public static void main(String[] args) {
        FiftyThree fiftyThree = new FiftyThree();
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(fiftyThree.maxSubArray(nums));
    }
}

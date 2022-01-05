package com.example.myproject.leetcode.easy.fivehundred;

import java.util.Arrays;

/**
 * 561.数组拆分 ①
 * so easy;
 * 思路: 发现他的取值每次都是最小两个相加,于是先排序再相加。
 */
public class SixtyOne {
    public int arrayPairSum(int[] nums) {
        int res = 0;
        int n = nums.length / 2;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            res += min(nums[2 * i], nums[2 * i + 1]);
        }
        return res;
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        SixtyOne sixtyOne = new SixtyOne();
        int[] nums = new int[]{6, 2, 6, 5, 1, 2};
        System.out.println(sixtyOne.arrayPairSum(nums));
    }
}

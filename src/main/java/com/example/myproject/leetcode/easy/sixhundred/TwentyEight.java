package com.example.myproject.leetcode.easy.sixhundred;

import java.util.Arrays;

import static java.lang.Math.max;

/**
 * 628.三个数的最大乘积
 * 可以再看
 * 逻辑如下
 * 首先排序
 * ①全是正 全是负 res为 序列最后三位乘积
 * ②有正 有负  三个最大整数乘积 或 两负数一正数 乘积,取出最大值
 */
public class TwentyEight {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        //求出三个最大正数的乘积，以及两个最小负数与最大正数的乘积
        return Math.max(nums[length - 1] * nums[length - 2] * nums[length - 3],nums[length - 1] * nums[0] * nums[1]);
    }

    public static void main(String[] args) {
        TwentyEight twentyEight = new TwentyEight();
        int[] nums = new int[]{-1, -2, 10, 5, -3};
        System.out.println(twentyEight.maximumProduct(nums));
    }
}

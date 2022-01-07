package com.example.myproject.leetcode.easy.sixhundred;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 643.子数组的最大平均数①
 * 滑动窗口
 * 建议再看
 */
public class FourtyThree {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int res = sum;
        for (int i = k; i < nums.length; i++) {
            //这里是滑动的精髓,通过删除 前一个 增加下一个  比如 1 2 3 4 5  现在 sum 是 2 3 4 我删除 2 加上 5
            // 变成 3 4 5
            sum = sum - nums[i - k] + nums[i];
            res = Math.max(sum, res);
        }
        return 1.0 * res / k;
    }

    public static void main(String[] args) {
        FourtyThree fourtyThree = new FourtyThree();
        int[] nums = new int[]{1, 12, -500, -6, 50, 3};
        System.out.println(fourtyThree.findMaxAverage(nums, 4));
    }
}

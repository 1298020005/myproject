package com.example.myproject.leetcode.easy.ninehundred;

import java.util.Arrays;

/**
 * 976.三角形的最大周长
 * 建议再看,很easy,状态不好
 * 思路就是先排序,然后利用贪心,从最大的数依次开始找
 */
public class SeventySix {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; --i) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SeventySix seventySix = new SeventySix();
        int[] nums = new int[]{3, 2, 3, 4};
        System.out.println(seventySix.largestPerimeter(nums));
    }
}

package com.example.myproject.leetcode.easy.ninehundred;

import java.util.Arrays;

/**
 * 977.有序数组的平方
 */
public class SeventySeven {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]= (int) Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-7,-3,2,3,11};
        SeventySeven seventySeven=new SeventySeven();
        System.out.println(seventySeven.sortedSquares(nums));
    }
}

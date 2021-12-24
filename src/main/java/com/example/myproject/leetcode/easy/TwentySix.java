package com.example.myproject.leetcode.easy;

import java.lang.reflect.Array;

/**
 * 删除有序数组的重复项
 * 注意i++与++i的区别
 */
public class TwentySix {
    public int removeDuplicates(int[] nums) {
        //双指针 一个遍历数组 一个用来存出不重复数据
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[++i] = nums[j];
            }
        }
        //加1是因为i 的初始值为 0 代表数组下标，与实际差1
        return i + 1;
    }

    public static void main(String[] args) {
        TwentySix twentySix = new TwentySix();
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(twentySix.removeDuplicates(nums));
    }
}

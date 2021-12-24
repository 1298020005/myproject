package com.example.myproject.leetcode.easy;

/**
 * 搜索插入位置
 * 此题目其实可以不用二分查找法
 * 只需要返回第一个返回第一个比他大的数
 */
public class ThirtyFive {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            //返回第一个比他大的数，因为是有序排列
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        ThirtyFive thirtyFive = new ThirtyFive();
        System.out.println(thirtyFive.searchInsert(nums, 5));
    }
}

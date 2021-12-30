package com.example.myproject.leetcode.easy.fourhundred;

/**
 * 485.最大连续1的个数
 * 方法一般 可以看下官方的
 */
public class EightyFive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;
        //赋值为-1 是因为在[1, 1, 0, 1]时,第一轮的right赋值为0
        int left = -1, right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                right = i;
            } else {
                left = i;
            }
            count = right - left;
            res = res > count ? res : count;
        }
        return res;
    }

    public static void main(String[] args) {
        EightyFive eightyFive = new EightyFive();
        int[] nums = new int[]{1, 0, 1, 1};
        System.out.println(eightyFive.findMaxConsecutiveOnes(nums));
    }
}

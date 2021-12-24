package com.example.myproject.leetcode.easy.onehundred;

/**
 * 136. 只出现一次的数字
 * 这个异或太阴间了
 * 性质为 一直乘 但是 他的性质中 两个相等的 乘为0 0乘常数为本身 所以 1*2*2=1*0=1
 */
public class ThirtySix {

    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        ThirtySix thirtySix = new ThirtySix();
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(thirtySix.singleNumber(nums));
    }
}

package com.example.myproject.leetcode.easy.fourhundred;

import java.util.Arrays;

/**
 * 453.最小操作次数使数组元素相等
 * 思路 只需要考虑数组中元素相对大小的变化即可。每次操作既可以理解为使 n-1n−1 个元素增加 11，
 * 也可以理解使 11 个元素减少 11。显然，后者更利于我们的计算。
 * 于是，要计算让数组中所有元素相等的操作数，我们只需要计算将数组中所有元素都减少到数组中元素最小值所需的操作数
 * 思路被虐了 可以再看
 */
public class FiftyThree {
    public int minMoves(int[] nums) {
        //取数组最小值
        int min = Arrays.stream(nums).min().getAsInt();
        int res = 0;
        for (int num : nums) {
            res += num - min;
        }
        return res;
    }

    public static void main(String[] args) {
        FiftyThree fiftyThree = new FiftyThree();
        int[] nums = new int[]{1, 2, 3};
        System.out.println(fiftyThree.minMoves(nums));
    }
}

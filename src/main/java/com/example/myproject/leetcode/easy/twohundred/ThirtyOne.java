package com.example.myproject.leetcode.easy.twohundred;

/**
 * 231.2的幂
 * 第一次指向没做出来呀,建议再看
 */
public class ThirtyOne {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        while (n != 1) {
            if (n % 2 == 1) return false;
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        ThirtyOne thirtyOne = new ThirtyOne();
        System.out.println(thirtyOne.isPowerOfTwo(17));
    }
}

package com.example.myproject.leetcode.easy.threehundred;

/**
 * 367. 有效的完全平方数
 */
public class SixtySeven {
    public boolean isPerfectSquare(int num) {
        int res = (int) Math.sqrt(num);
        return res * res == num;
    }

    public static void main(String[] args) {
        SixtySeven sixtySeven = new SixtySeven();
        System.out.println(sixtySeven.isPerfectSquare(16));
    }
}

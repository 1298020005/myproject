package com.example.myproject.leetcode.easy.fourhundred;

/**
 * 441.排列硬币
 */
public class FourtyOne {
    public int arrangeCoins(int n) {
        if(n==1) return n;
        int res = n;
        for (int i = 1; i <= n; i++) {
            if (res < i || res == 0) {
                return i - 1;
            } else {
                res -= i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FourtyOne fourtyOne = new FourtyOne();
        System.out.println(fourtyOne.arrangeCoins(10));
    }
}

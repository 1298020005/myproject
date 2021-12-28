package com.example.myproject.leetcode.easy.twohundred;

/**
 * 258.各位相加
 * 递归解决不难
 */
public class FiftyEight {
    public int addDigits(int num) {
        while (num >= 10) {
            int res = 0;
            while (num != 0) {
                res += num % 10;
                num /= 10;
            }
            num = res;
        }
        return num;
    }

    public static void main(String[] args) {
        FiftyEight fiftyEight = new FiftyEight();
        System.out.println(fiftyEight.addDigits(38));
    }
}

package com.example.myproject.leetcode.easy;

/**
 * 判断回文数
 * 用第七题的逻辑加了一个判断
 */
public class Nine {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int res = 0;
        while (temp != 0) {
            res = res * 10 + temp % 10;
            temp = temp / 10;
        }

        return x == res ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }
}

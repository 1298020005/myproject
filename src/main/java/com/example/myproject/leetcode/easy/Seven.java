package com.example.myproject.leetcode.easy;

/**
 * 整数反转
 * 正常逻辑不难 判断溢出这里 需要想一哈
 */
public class Seven {
    public static int reverse(int x) {
        int temp =x;
        int res = 0;
        while (temp != 0) {
            if (res > 214748364 || res < -214748364) {
                return 0;
            }
            res = res * 10 + temp % 10;
            temp = temp / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }
}

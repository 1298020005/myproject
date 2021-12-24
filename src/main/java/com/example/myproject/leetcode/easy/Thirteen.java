package com.example.myproject.leetcode.easy;

/**
 * 罗马转整数
 * 建议再写一次
 * 字符串获取方法 charAt 挺有意思的
 */
public class Thirteen {
    public static int romanToInt(String s) {
        int res = 0;
        int preNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int nextNum = getValue(s.charAt(i));
            if (preNum >= nextNum) {
                res = res + preNum;
            } else {
                res = res - preNum;
            }
            preNum = nextNum;
        }
        res += preNum;
        return res;
    }

    private static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVI"));
    }
}

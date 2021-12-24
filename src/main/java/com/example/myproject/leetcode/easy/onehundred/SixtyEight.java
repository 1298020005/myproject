package com.example.myproject.leetcode.easy.onehundred;

/**
 * 168.Excel表列名称
 * 难点在于联想到取余数(其实可以等价于26进制)
 * 其次关于字符和数字转换 A=65
 */
public class SixtyEight {
    public String convertToTitle(int columnNumber) {
        StringBuffer res = new StringBuffer();
        while (columnNumber != 0) {
            //测试为什么需要--
//            int a = columnNumber % 26;
//            int b=a+'A';
//            char c= (char) b;
            columnNumber--;
            res.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        SixtyEight sixtyEight = new SixtyEight();
        System.out.println(sixtyEight.convertToTitle(27));
    }
}

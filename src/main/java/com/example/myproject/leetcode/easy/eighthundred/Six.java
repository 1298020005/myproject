package com.example.myproject.leetcode.easy.eighthundred;

/**
 * 806.写字符串需要的行数
 * 解决 芜湖
 *
 */
public class Six {
    public int[] numberOfLines(int[] widths, String s) {
        int[] res = new int[2];
        int row = 0, sum = 0, remain = 100;
        char[] character = s.toCharArray();
        for (char c : character) {
            int b = widths[c - 'a'];
            if (b > remain) {
                row++;
                remain = 100 - b;
            } else {
                remain = remain - b;
            }
        }
        res[0] = row+1;
        res[1] = 100 - remain;
        return res;
    }

    public static void main(String[] args) {
        int[] widths = new int[]{5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        Six six = new Six();
        for (int i : six.numberOfLines(widths, "bbbcccdddaa")) {
            System.out.println(i);
        }
    }
}

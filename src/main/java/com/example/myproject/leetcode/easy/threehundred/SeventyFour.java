package com.example.myproject.leetcode.easy.threehundred;

/**
 *374.猜数字大小
 * 二分法 虽然是自己写的,但是模板不够标准,建议再看。
 */
public class SeventyFour {
    public int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int res = n / 2;
        int left = 0, right = n;
        while (guess(res) != 0) {
            if (guess(res) == 1) {
                //注意这里如果不+1,则 用例 如 4 4 是去不到4的 因为 他最高取到 3 而 (4-3)/2 永远为 0
                left = res + 1;
            } else {
                right = res;
            }
            res = left + (right - left) / 2;
        }
        return res;
    }

    private int guess(int n) {
        return n;
    }

    public static void main(String[] args) {
        System.out.println(5 / 2);
    }
}

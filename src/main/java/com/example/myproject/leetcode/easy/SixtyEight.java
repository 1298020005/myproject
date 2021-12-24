package com.example.myproject.leetcode.easy;

/**
 * sqrt(x)
 * 有关二分法 为什么 加一 减去一
 * 建议在看
 */
public class SixtyEight {
    public int mySqrt(int x) {
        if (x == 1) {
            return x;
        }

        int right = x, left = 0, res = right, ans = -1;
        while (right >= left) {
//36  18   9   4  6
            res = left + (right - left) / 2;
            if (x == (long) res * res) {
                return res;
            } else if (x < (long) res * res) {
                right = res - 1;
            } else if (x > (long) res * res) {
                ans = res;
                left = res + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SixtyEight sixtyEight = new SixtyEight();
        System.out.println(sixtyEight.mySqrt(2147395599));
    }
}

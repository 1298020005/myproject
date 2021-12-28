package com.example.myproject.leetcode.easy.twohundred;

public class SixtyThree {
    //为判断 nn 是否满足上述形式，可以对 nn 反复除以 2,3,52,3,5，
    // 直到 nn 不再包含质因数 2,3,52,3,5。若剩下的数等于 11，
    // 则说明 nn 不包含其他质因数，是丑数；否则，说明 nn 包含其他质因数，不是丑数。
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        SixtyThree sixtyThree=new SixtyThree();
        System.out.println(sixtyThree.isUgly(14));
    }
}

package com.example.myproject.leetcode.easy.threehundred;

/**
 * 326. 3的幂
 */
public class TwentySix {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        // 9 %3 = 0 9 /3 =3
        //不断地将 nn 除以 33，直到 n=1n=1。如果此过程中 nn 无法被 33 整除，就说明 nn 不是 33 的幂
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        TwentySix twentySix = new TwentySix();
        System.out.println(twentySix.isPowerOfThree(45));
    }
}

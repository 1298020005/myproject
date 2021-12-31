package com.example.myproject.leetcode.easy.fivehundred;

/**
 * 507.完美数
 * 很easy
 */
public class Seven {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        if (num == 1) {
            return false;
        }
        //我们只需要枚举不超过 sqrt(num) 的2数字
        for (int i = 2; i * i <= num; i++) {
            int flag = num % i;
            int divisor = num / i;
            if (flag == 0) {
                sum += divisor + i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Seven seven = new Seven();
        System.out.println(seven.checkPerfectNumber(28));
    }
}

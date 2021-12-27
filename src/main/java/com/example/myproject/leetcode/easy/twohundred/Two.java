package com.example.myproject.leetcode.easy.twohundred;

import java.util.HashSet;

/**
 * 202.快乐数
 * 思路 利用hashset 不能重复元素的性质
 *
 */
public class Two {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public int getNext(int n) {
        int next = 0;
        while (n > 0) {
            int d = n % 10;
            next += d * d;
            n = n / 10;
        }
        return next;
    }

    public static void main(String[] args) {
        Two two = new Two();
        System.out.println(two.isHappy(19));
    }
}

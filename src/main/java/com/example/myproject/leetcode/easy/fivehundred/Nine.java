package com.example.myproject.leetcode.easy.fivehundred;

import java.util.ArrayList;

/**
 * 509.斐波那契数
 */
public class Nine {
    public int fib(int n) {
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        for (int i = 2; i <= n; i++) {
            int data = fib.get(i - 1) + fib.get(i - 2);
            fib.add(data);
        }
        return  fib.get(n);
    }

    public static void main(String[] args) {
        Nine nine = new Nine();
        System.out.println(nine.fib(4));
    }
}

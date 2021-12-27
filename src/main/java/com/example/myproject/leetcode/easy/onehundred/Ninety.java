package com.example.myproject.leetcode.easy.onehundred;

/**
 * 90 颠倒二进制位
 * copy官方的,需要自己额外再看。
 * 建议再看
 */
public class Ninety {
    public int reverseBits(int n) {
        int c= Integer.reverse(123);
        System.out.println(c);
        return Integer.reverse(n);
    }

    public static void main(String[] args) {
        Ninety ninety=new Ninety();
        System.out.println(ninety.reverseBits(111));
    }
}

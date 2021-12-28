package com.example.myproject.leetcode.easy.threehundred;

public class FourtyTwo {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 0 && n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        FourtyTwo fourtyTwo = new FourtyTwo();
        System.out.println(fourtyTwo.isPowerOfFour(16));
    }
}

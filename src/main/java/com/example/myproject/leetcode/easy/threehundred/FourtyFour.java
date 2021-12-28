package com.example.myproject.leetcode.easy.threehundred;

/**
 * 344.反转字符串
 * 完全自己写的哦
 */
public class FourtyFour {
    public void reverseString(char[] s) {
        Character temp;
        int length = s.length - 1;
        for (int i = 0; i <= length / 2; i++) {
            temp = s[i];
            s[i] = s[length - i];
            s[length - i] = temp;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        FourtyFour fourtyFour = new FourtyFour();
        char[] s = new char[]{'h', 'e', 's', 'l', 'l', 'o'};
        fourtyFour.reverseString(s);
    }
}

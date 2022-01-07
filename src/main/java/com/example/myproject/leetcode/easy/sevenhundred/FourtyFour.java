package com.example.myproject.leetcode.easy.sevenhundred;

import com.example.myproject.leetcode.easy.sixhundred.FourtyFive;

/**
 * 744.寻找比目标字母大的最小字母
 */
public class FourtyFour {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters)
            if (c > target) return c;
        return letters[0];
    }

    public static void main(String[] args) {
        FourtyFour fourtyFour = new FourtyFour();
        char[] letters = new char[]{'c', 'f', 'j'};
        System.out.println(fourtyFour.nextGreatestLetter(letters, 'g'));
    }
}

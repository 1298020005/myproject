package com.example.myproject.leetcode.easy.threehundred;

import java.util.HashMap;

/**
 * 383.赎金信
 */
public class EightyThree {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> seen = new HashMap<>();
        char[] mags = magazine.toCharArray();
        char[] rans = ransomNote.toCharArray();
        for (Character mag : mags) {
            int count = seen.getOrDefault(mag, 0);
            seen.put(mag, ++count);
        }
        for (Character ran : rans) {
            int flag = seen.getOrDefault(ran, 0);
            if (flag != 0) {
                seen.put(ran, --flag);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        EightyThree eightyThree = new EightyThree();
        System.out.println(eightyThree.canConstruct("aa", "ab"));
    }
}

package com.example.myproject.leetcode.easy.threehundred;

import java.util.HashMap;

/**
 * 389.找不同
 *
 */
public class EightyNine {
    public char findTheDifference(String s, String t) {
        if (s.length() > t.length()) {
            return findTheDifference(t, s);
        }
        HashMap<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            seen.put(s.charAt(i), seen.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            int count = seen.getOrDefault(t.charAt(i),0);
            if (count == 0) {
                return t.charAt(i);
            } else {
                seen.put(t.charAt(i), --count);
            }
        }
        return t.charAt(0);
    }

    public static void main(String[] args) {
        EightyNine eightyNine = new EightyNine();
        System.out.println(eightyNine.findTheDifference("abcd", "abcde"));
    }
}

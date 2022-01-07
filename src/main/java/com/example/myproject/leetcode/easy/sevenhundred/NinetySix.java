package com.example.myproject.leetcode.easy.sevenhundred;

import com.example.myproject.leetcode.easy.twohundred.Ninety;
import sun.security.util.Length;

/**
 * 796.旋转字符串
 */
public class NinetySix {
    public boolean rotateString(String s, String goal) {
        int length=s.length();
        for (int i = 0; i < length; i++) {
            s = s.substring(1, s.length()) + s.substring(0,1);
            if (s.equals(goal)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        NinetySix ninetySix = new NinetySix();
        System.out.println("abcde".substring(0,1));
        System.out.println(ninetySix.rotateString("abcde", "cdeab"));
    }
}

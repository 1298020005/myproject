package com.example.myproject.leetcode.easy;

import java.util.concurrent.CountDownLatch;

/**
 * 最后一个单词的长度
 */
public class FiftyEight {
    public int lengthOfLastWord(String s) {
        int res = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                if (res == 0) continue;
                break;
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        FiftyEight fiftyEight = new FiftyEight();
        System.out.println(fiftyEight.lengthOfLastWord("a"));
    }
}

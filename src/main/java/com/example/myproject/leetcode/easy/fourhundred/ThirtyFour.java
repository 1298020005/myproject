package com.example.myproject.leetcode.easy.fourhundred;

/**
 * 434.字符串中的单词数
 * 建议在看,虽然很简单,看题解做的
 */
public class ThirtyFour {

    public int countSegments(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            /**
             * 当遇到非空字符串时
             * ①其是第一个字符
             * ②其前一个字符为空
             * 则结果+1
             */
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                res++;
            }
        }
        return res;
    }

}

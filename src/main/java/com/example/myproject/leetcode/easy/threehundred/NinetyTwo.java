package com.example.myproject.leetcode.easy.threehundred;

import com.example.myproject.leetcode.easy.twohundred.Ninety;

/**
 * 392.判断子序列
 * 建议再看,虽然逻辑不难,贪图省时间,直接砍答案了
 * 我们初始化两个指针 ii 和 jj，分别指向 ss 和 tt 的初始位置。
 * 每次贪心地匹配，匹配成功则 ii 和 jj 同时右移，匹配 ss 的下一个位置，匹配失败则 jj 右移，ii 不变，
 * 尝试用 tt 的下一个字符匹配 ss。
 * 最终如果 ii 移动到 ss 的末尾，就说明 ss 是 tt 的子序列。
 */
public class NinetyTwo {
    //双指针法
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        NinetyTwo ninetyTwo = new NinetyTwo();
        System.out.println(ninetyTwo.isSubsequence("axc", "axhbgd"));
    }
}

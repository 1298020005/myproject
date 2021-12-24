package com.example.myproject.leetcode.easy;

/**
 * 最长公共前缀
 * 此题也是在校验长度上 花了时间
 * 建议总结回顾下 下表越界的问题
 */
public class Fourteen {
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        //需要 第一个字符串从 0开始 比较
        for (int i = 0; i < strs[0].length(); i++) {
            String temp = strs[0].substring(0, i + 1);
            for (int j = 1; j < strs.length; j++) {
                if (i + 1 > strs[j].length() || !temp.equals(strs[j].substring(0, i + 1))) {
                    return res;
                }
            }
            res = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] a = new String[]{"ab", "a"};
        System.out.println(longestCommonPrefix(a));
    }
}

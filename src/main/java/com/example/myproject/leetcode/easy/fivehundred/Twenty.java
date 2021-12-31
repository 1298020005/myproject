package com.example.myproject.leetcode.easy.fivehundred;

/**
 * 520.检测大写字母
 * 有使用异或运算符 可以再看
 * 其实都用管第一个字母 第二个和之后必须相同
 */
public class Twenty {
    public boolean detectCapitalUse(String word) {
        // 若第 1 个字母为小写，则需额外判断第 2 个字母是否为小写
        if (word.length() >= 2 && Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            return false;
        }

        // 无论第 1 个字母是否大写，其他字母必须与第 2 个字母的大小写相同
        for (int i = 2; i < word.length(); ++i) {
            //异或预算符 相同为 0 不同为 1
            if (Character.isLowerCase(word.charAt(i)) ^ Character.isLowerCase(word.charAt(1))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Twenty twenty=new Twenty();
        System.out.println(twenty.detectCapitalUse("FlaG"));
    }
}

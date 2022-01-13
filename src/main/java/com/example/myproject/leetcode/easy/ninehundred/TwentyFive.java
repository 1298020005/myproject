package com.example.myproject.leetcode.easy.ninehundred;

/**
 * 925.长按键入
 * 建议再看,纯粹的逻辑
 */
public class TwentyFive {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        // 利用双指针做循环判定
        while (j < typed.length()) {
            //情况① 两个字符串存在一对匹配的字符
            //情况② 存在一次长按
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }

    public static void main(String[] args) {
        TwentyFive twentyFive = new TwentyFive();
        System.out.println(twentyFive.isLongPressedName("leelee", "lleeelee"));
    }
}

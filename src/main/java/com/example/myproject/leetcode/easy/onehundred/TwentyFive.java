package com.example.myproject.leetcode.easy.onehundred;

/**
 * 125. 验证回文串
 * 设计到双指针 有待研究 目前实现的是采用 反转字符来验证
 * 建议再看
 */
public class TwentyFive {
    public boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }


    public static void main(String[] args) {
        TwentyFive twentyFive=new TwentyFive();
        System.out.println(twentyFive.isPalindrome("A man, a plan, a canal: Panama"));
    }

}

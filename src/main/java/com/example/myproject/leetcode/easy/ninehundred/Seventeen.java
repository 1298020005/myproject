package com.example.myproject.leetcode.easy.ninehundred;

import java.util.Stack;

/**
 * 917.仅仅反转字母
 * 可以再看
 * 使用栈的思路很精髓
 * 之前外的想法是反转字符串并去除字符-,但在实际操作汇中,比较麻烦，要先构建一个字符串去除字符-
 */
public class Seventeen {
    public String reverseOnlyLetters(String s) {
        //构建栈存储 出-字符外的字母
        Stack<Character> letters = new Stack();
        for (char c: s.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        //遍历原字符串,当是原字符串是,栈抛出
        for (char c: s.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Seventeen seventeen=new Seventeen();
        System.out.println(seventeen.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}

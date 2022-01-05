package com.example.myproject.leetcode.easy.fivehundred;

/**
 * 557. 反转字符串中的单词 ③
 * so easy~
 */
public class FiftySeven {
    public String reverseWords(String s) {
        StringBuffer temp = new StringBuffer();
        StringBuffer res = new StringBuffer();
        for (char ss : s.toCharArray()) {
            if (ss == ' ') {
                res.append(temp.reverse() + " ");
                temp.delete(0, temp.length());
            } else {
                temp.append(ss);
            }
        }
        res.append(temp.reverse());
        return res.toString();
    }

    public static void main(String[] args) {
        FiftySeven fiftySeven = new FiftySeven();
        System.out.println(fiftySeven.reverseWords("Let's take LeetCode contest"));
    }
}

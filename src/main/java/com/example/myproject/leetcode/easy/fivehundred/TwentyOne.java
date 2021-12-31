package com.example.myproject.leetcode.easy.fivehundred;

/**
 * 521.最长特殊序列
 * 有点像脑筋急转弯 可以再看
 * ① 如果两个字符串相同，则没有特殊子序列
 * ② a长等于b长且a！=b 例如：abc 和 abd。
 * 此情况下,一个字符串一定不会是另外一个字符串的子序列，因此可以将任意一个字符串看作是特殊子序列
 * ③ a.length！=b.length 例如abcd 和 abc。
 * 这种情况下，长的字符串一定不会是短字符串的子序列，因此可以将长字符串看作是特殊子序列
 */
public class TwentyOne {
    public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        return Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        TwentyOne twentyOne=new TwentyOne();
        System.out.println(twentyOne.findLUSlength("aaa","bbb"));
    }
}

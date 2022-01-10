package com.example.myproject.leetcode.easy.eighthundred;

/**
 * 844.比较含退格的字符串
 */
public class FourtyFour {
    public boolean backspaceCompare(String s, String t) {
        //思路 先得出两个字符串 去除退格符和应删除字符的原定字符串 然后比较两个字符串是否相等
        return build(s).equals(build(t));
    }

    // 因为要复用两遍 所以写一个函数
    public String build(String str) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                res.append(str.charAt(i));
            } else {
                if (res.length() > 0) {
                    //注意此处不可以写成i,因为 abc### i并不为实际下标
                    res.deleteCharAt(res.length() - 1);
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        FourtyFour fourtyFour = new FourtyFour();
        System.out.println(fourtyFour.backspaceCompare("ab##", "c#d#"));
    }

}

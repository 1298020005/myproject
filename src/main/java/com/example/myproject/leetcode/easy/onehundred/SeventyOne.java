package com.example.myproject.leetcode.easy.onehundred;

public class SeventyOne {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        StringBuffer b=new StringBuffer();
        char[] chars=b.append(columnTitle).reverse().toString().toCharArray();
        for (char c:chars){
            System.out.println(c);
            res+=c-65+26;
        }
        return res-26;
    }

    public static void main(String[] args) {
        SeventyOne seventyOne=new SeventyOne();
        System.out.println(seventyOne.titleToNumber("AB"));
    }
}

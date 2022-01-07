package com.example.myproject.leetcode.easy.sevenhundred;

/**
 * 709.转换成小写字母
 * 第二种自定义api 可以参考官方的例子再看一下
 */
public class Nine {
    public String toLowerCase(String s) {
        return  s.toLowerCase();
    }

    public static void main(String[] args) {
        Nine nine=new Nine();
        System.out.println(nine.toLowerCase("LOVELY"));
    }
}

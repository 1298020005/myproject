package com.example.myproject.leetcode.easy.fivehundred;

import org.apache.logging.log4j.util.Strings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 541.反转字符串2
 * 再看！完全自己写的 烂的一批的代码
 * https://blog.csdn.net/zzzzlei123123123/article/details/88426944
 */
public class FourtyOne {
//    public String reverseStr(String s, int k) {
//        StringBuilder res = new StringBuilder();
//        int index = 0;
//        int length = s.length();
//        while (index < length) {
//            int end = Math.min(index + k, length);
//            StringBuilder temp = new StringBuilder(s.substring(index, end));
//            if ((index / k) % 2 == 0) res.append(temp.reverse());
//            else res.append(temp);
//            index = end;
//        }
//        return res.toString();
//    }
    public String reverseStr(String s, int k) {
        int num = s.length() / (2 * k);
        int remainder = s.length() % (2 * k);
        String[] seen = new String[num * 2];
        for (int i = 0; i < num; i++) {
            // 0 1+  2 3+ 4 5+ 6
            StringBuffer temp = new StringBuffer();
            temp.append(s.substring(i * 2 * k, (i * 2 + 1) * k)).reverse();
            seen[i * 2] = String.valueOf(temp);
            seen[i * 2 + 1] = s.substring((i * 2 + 1) * k, (i * 2 + 2) * k);
        }
        String res = null;
        for (String ss : seen) {
            res = res != null ? res + ss : ss;
        }
        //余数不等于=0 两种情况 ①字符数目不够 2k*n ② 字符2k*n + 多一些
        if (remainder != 0) {
            //num>0 说明是情况 2
            if (num > 0) {
                if (remainder > k) {
                    StringBuffer temp = new StringBuffer();
                    temp.append(s.substring(num * 2 * k, (num * 2 + 1) * k)).reverse();
                    res += String.valueOf(temp);
                    res += remainder == s.length() - 1 ? s.substring(s.length() - 1) : s.substring((num * 2 + 1) * k, s.length());
                } else {
                    StringBuffer temp = new StringBuffer();
                    temp.append(remainder == 1 ? s.substring(s.length() - 1) : s.substring(num * 2 * k, s.length())).reverse();
                    res += String.valueOf(temp);
                }
            } else {
                if (s.length() > k) {
                    StringBuffer temp = new StringBuffer();
                    temp.append(s.substring(0, k)).reverse();
                    res = String.valueOf(temp);
                    if (s.length() - k == 1) {
                        res += s.substring(s.length() - 1);
                    } else {
                        res += s.substring(k, s.length());
                    }
                } else {
                    StringBuffer temp = new StringBuffer();
                    temp.append(s).reverse();
                    res = String.valueOf(temp);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FourtyOne fourtyOne = new FourtyOne();
//        System.out.println("abcdefg".substring(0, 4));
        //abc def ghi jkl mn
        System.out.println(fourtyOne.reverseStr("abcdefghijklmn", 3));
//        System.out.println(fourtyOne.reverseStr("ab", 2));
    }
}

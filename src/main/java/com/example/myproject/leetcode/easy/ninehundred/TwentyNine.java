package com.example.myproject.leetcode.easy.ninehundred;

import java.util.HashSet;

/**
 * 929.独特的电子邮件
 */
public class TwentyNine {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> res = new HashSet<>();
        for (String e : emails) {
            //移除所有.
            String temp=e.substring(e.indexOf('@'));
            e = e.replace(e.substring(e.indexOf('@')), "");
            e = e.replace(".", "");
            //移除+到@之间的内容
            if (e.contains("+")) {
                // ①先获得 '+' 的坐标下标
                // ②再利用substring截取这一段的长度
                // ③根据截取的字符串替换为空
                e = e.replace(e.substring(e.indexOf('+')), "");
            }
            res.add(e+temp);
        }
        return res.size();
    }

    public static void main(String[] args) {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        TwentyNine twentyNine = new TwentyNine();
        System.out.println(twentyNine.numUniqueEmails(emails));

    }
}

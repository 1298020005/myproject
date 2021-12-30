package com.example.myproject.leetcode.easy.fourhundred;

/**
 * 482.秘钥格式化
 * 参考的答案,逻辑不难,建议再看
 */
public class EightyTwo {
    public String licenseKeyFormatting(String s, int k) {
        //结果字符串
        StringBuffer res = new StringBuffer();
        //用于统计是否需要 加-
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            //遍历原字符串 将字符'-'之外的取出
            if (s.charAt(i) != '-') {
                //已经取出的字符总数
                count++;
                //将遍历字符转换为大写,放入结果字符中
                res.append(Character.toUpperCase(s.charAt(i)));
                //对字符进行计数时，每隔 kk 个字符就在字符串res中添加一个破折号
                if (count % k == 0) {
                    res.append('-');
                }
            }
        }
        //字符串res的最后一个字符为破折号则将其去掉
        if (res.length() > 0 && res.charAt(res.length() - 1) == '-') {
            res.deleteCharAt(res.length() - 1);
        }
        //反转字符
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        EightyTwo eightyTwo = new EightyTwo();
        System.out.println(eightyTwo.licenseKeyFormatting("2-5g-3-J", 2));
    }
}

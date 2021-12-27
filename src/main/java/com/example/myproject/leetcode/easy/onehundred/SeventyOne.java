package com.example.myproject.leetcode.easy.onehundred;

/**
 * 171. excle 表列名称
 * 逻辑基本同168题
 */
public class SeventyOne {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        StringBuffer b = new StringBuffer();
        //先将字符串反转
        char[] chars = b.append(columnTitle).reverse().toString().toCharArray();
        int flag = 0;
        for (char c : chars) {
            System.out.println(c);
            // 次方
            int s = (int) Math.pow(26, flag);
            res = (int) ((c - 64) * Math.pow(26, flag) + res);
            flag++;
        }
        return res;
    }

    public static void main(String[] args) {
//        for(int i = 0;i<255;i++){
//            char a = (char) i;
//            System.out.println(a+"........."+i);
//        }
        SeventyOne seventyOne = new SeventyOne();
        System.out.println(seventyOne.titleToNumber("FXSHRXW"));
    }
}

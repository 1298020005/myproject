package com.example.myproject.leetcode.easy.fourhundred;

/**
 * 415.字符串相加
 * 建议再看,注释自己添加的,思路看的题解
 */
public class Fifteen {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        //定义双指针,指向num1,num2尾部,模拟人工算法。
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            //注意这个字符减去 - '0'  如果i j <0 赋值0
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            // 添加当前位
            int tmp = n1 + n2 + carry;
            // 计算进位
            carry = tmp / 10;
            res.append(tmp % 10);
            i--;
            j--;
        }
        if (carry == 1) res.append(1);
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        Fifteen fifteen = new Fifteen();
        System.out.println(fifteen.addStrings("456", "77"));
    }
}

package com.example.myproject.leetcode.easy.fivehundred;

/**
 * 551.学生出勤记录
 * 比较easy
 */
public class FiftyOne {
    public boolean checkRecord(String s) {
        char[] ss = s.toCharArray();
        int absent = 0, Late = 0;
        for (char c : ss) {
            switch (c) {
                case 'A':
                    absent++;
                    if (absent >= 2) return false;
                    Late = 0;
                    break;
                case 'L':
                    Late++;
                    if (Late >= 3) return false;
                    break;
                case 'P':
                    Late = 0;
                    break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FiftyOne fiftyOne = new FiftyOne();
        System.out.println(fiftyOne.checkRecord("AAAA"));
    }
}

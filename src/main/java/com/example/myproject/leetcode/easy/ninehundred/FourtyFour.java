package com.example.myproject.leetcode.easy.ninehundred;

import sun.security.util.Length;

/**
 * 944.删列造序
 */
public class FourtyFour {
    public int minDeletionSize(String[] A) {
        int ans = 0;
        //外层for 是列数目
        for (int c = 0; c < A[0].length(); ++c){
            //内层为 数组长度
            for (int r = 0; r < A.length - 1; ++r){
                if (A[r].charAt(c) > A[r+1].charAt(c)) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        FourtyFour fourtyFour=new FourtyFour();
        String[] strs=new String[]{"zyx","wvu","tsr"};
        System.out.println(fourtyFour.minDeletionSize(strs));
    }
}

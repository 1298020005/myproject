package com.example.myproject.leetcode.easy.fivehundred;

import java.util.HashSet;

/**
 * 575.分糖果
 * 思路:利用hashset 得出共有多少种不同的糖果
 * 糖果总数和能吃糖果类型的最小值就是最终结果
 */
public class SeventyFive {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> temp=new HashSet<>();
        for (int c:candyType){
            temp.add(c);
        }
        return temp.size()<candyType.length/2?temp.size():candyType.length/2;
    }

    public static void main(String[] args) {
        SeventyFive seventyFive=new SeventyFive();
        int[] candyType=new int[]{1,1,2,2,3,3};
        System.out.println(seventyFive.distributeCandies(candyType));
    }
}
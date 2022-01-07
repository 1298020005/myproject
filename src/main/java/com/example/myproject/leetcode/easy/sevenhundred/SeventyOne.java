package com.example.myproject.leetcode.easy.sevenhundred;

import java.util.HashSet;

/**
 * 771.宝石与石头
 */
public class SeventyOne {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> seen=new HashSet<>();
        for (Character c:jewels.toCharArray()){
            seen.add(c);
        }
        int res=0;
        for (Character c:stones.toCharArray()){
            if (seen.contains(c)){
                res++;
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        SeventyOne seventyOne=new SeventyOne();
        System.out.println(seventyOne.numJewelsInStones("aA","aAAbbbb"));
    }
}

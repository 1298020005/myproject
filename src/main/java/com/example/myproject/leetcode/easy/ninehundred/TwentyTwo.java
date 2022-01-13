package com.example.myproject.leetcode.easy.ninehundred;

/**
 * 922.按奇偶排序数组 II
 */
public class TwentyTwo {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res=new int[nums.length];
        int odd=1,even=0;
        for(int n:nums){
            if (n%2==0){
                res[even]=n;
                even+=2;
            }else {
                res[odd]=n;
                odd+=2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TwentyTwo twentyTwo=new TwentyTwo();
        int[] nums=new int[]{4,2,5,7};
        System.out.println(twentyTwo.sortArrayByParityII(nums));
    }
}

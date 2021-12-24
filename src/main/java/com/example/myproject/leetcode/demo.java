package com.example.myproject.leetcode;

public class demo {
    public static void main(String[] args) {
        int[] nums=new int[]{8,7,6,5,4,3,2,1};
        int single=0;
        for (int num:nums){
            single=single ^ num;
        }
    }
}

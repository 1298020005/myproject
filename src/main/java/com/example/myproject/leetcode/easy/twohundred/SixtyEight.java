package com.example.myproject.leetcode.easy.twohundred;

import java.util.Arrays;

/**
 * 268.丢失的数字
 */
public class SixtyEight {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        SixtyEight sixtyEight=new SixtyEight();
        int[] nums=new int[]{3,0,1};
        System.out.println(sixtyEight.missingNumber(nums));
    }
}

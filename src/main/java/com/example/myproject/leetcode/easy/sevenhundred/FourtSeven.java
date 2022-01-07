package com.example.myproject.leetcode.easy.sevenhundred;

import java.util.Arrays;

/**
 * 747.至少是其他数字两倍的最大数
 */
public class FourtSeven {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1){
            return 0;
        }
        int[] clone=nums.clone();
        Arrays.sort(nums);
        if (nums[nums.length-1]>=nums[nums.length-2]*2){
            return printArray(clone,nums[nums.length-1]);
        }
        return -1;
    }

    public static int printArray(int[] array,int value){
        for(int i = 0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;//当if条件不成立时，默认返回一个负数值-1
    }

    public static void main(String[] args) {
        FourtSeven fourtSeven=new FourtSeven();
        int[] nums=new int[]{1,0,0,0};
        System.out.println(fourtSeven.dominantIndex(nums));
    }
}

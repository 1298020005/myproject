package com.example.myproject.leetcode.easy.onehundred;

/**
 *
 */
public class SixtySeven {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target){
                    res[0]=i+1;
                    res[1]=j+1;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SixtySeven sixtySeven=new SixtySeven();
        int[] nums=new int[]{2,7,11,15};
        sixtySeven.twoSum(nums,9);
    }
}

package com.example.myproject.leetcode.easy.sixhundred;

/**
 * 674.最长连续递增序列
 */
public class SeventyFour {
    public int findLengthOfLCIS(int[] nums) {
        int l = 0, r = 0, res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                r=i;
            } else {
                l=i;
            }
            res=Math.max(res,r-l);
        }
        return  res+1;
    }

    public static void main(String[] args) {
        SeventyFour seventyFour = new SeventyFour();
//        int[] nums = new int[]{1,3,5,4,2,3,4,5};
        int[] nums = new int[]{1,3,5,4,7};
        System.out.println(seventyFour.findLengthOfLCIS(nums));
    }
}

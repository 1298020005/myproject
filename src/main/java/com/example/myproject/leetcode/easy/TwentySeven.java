package com.example.myproject.leetcode.easy;

/**
 * 移除元素
 * 不懂为什么 不对 赋值为0的时候
 *
 */
public class TwentySeven {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        int ans = nums.length;
        while (j< ans){
            if(nums[j]==val){
                nums[j]= nums[ans - 1];
                ans--;
            }else {
                j++;
            }
        }
        return ans;
//        while (j<nums.length){
//            if(nums[j]==val){
//                nums[j]=0;
//                i++;
//            }else {
//                j++;
//            }
//        }
//        return j-i;
    }
    public static void main(String[] args) {
        TwentySeven twentySix = new TwentySeven();
        int[] nums = new int[]{3,2,2,3};
        System.out.println(twentySix.removeElement(nums,3));
    }
}

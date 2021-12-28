package com.example.myproject.leetcode.easy.twohundred;

public class EightyThree {
    public void moveZeroes(int[] nums) {
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        EightyThree eightyThree=new EightyThree();
        int[] nums=new int[]{0,1,0,3,12};
        eightyThree.moveZeroes(nums);
    }
}

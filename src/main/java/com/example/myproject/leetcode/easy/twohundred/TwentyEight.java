package com.example.myproject.leetcode.easy.twohundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 228.汇总区间
 * 纯粹自己写,通过了,官网有更好的写法,再看下把。
 */
public class TwentyEight {
    public List<String> summaryRanges(int[] nums1) {
        int[] nums= Arrays.copyOf(nums1,nums1.length+1);
        ArrayList<String> res = new ArrayList<>();
        if(nums1.length==1){
            res.add(String.valueOf(nums1[0]));
            return  res;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                start = nums[i];
                end = nums[i];
            } else {
                if (nums[i] == end+1) {

                } else{
                    if(start==end){
                        res.add(String.valueOf(start));
                    }else{
                        res.add(String.valueOf(start)+"->"+String.valueOf(end));
                    }
                    start=nums[i];
                }
                end=nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TwentyEight twentyEight = new TwentyEight();
        int[] nums = new int[]{ 4, 5, 7};
        System.out.println(twentyEight.summaryRanges(nums));
    }
}

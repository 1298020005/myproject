package com.example.myproject.leetcode.easy.twohundred;

import java.util.ArrayList;
import java.util.List;

public class TwentyEight {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        int temp = 0;
        int start=0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                temp = nums[i];
            } else {
                if (nums[i] == ++temp) {
                    start=
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        TwentyEight twentyEight = new TwentyEight();
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        twentyEight.summaryRanges(nums);
    }
}

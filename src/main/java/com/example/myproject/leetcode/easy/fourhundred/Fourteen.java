package com.example.myproject.leetcode.easy.fourhundred;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 414 第三大的数
 */
public class Fourteen {
    public int thirdMax(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (seen.add(nums[i])) {
                if (seen.size() == 3) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        Fourteen fourteen = new Fourteen();
        int[] nums = new int[]{2, 2, 3, 1};
        System.out.println(fourteen.thirdMax(nums));
    }
}

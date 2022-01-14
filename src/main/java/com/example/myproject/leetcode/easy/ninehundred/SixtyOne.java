package com.example.myproject.leetcode.easy.ninehundred;

import java.util.HashMap;

/**
 * 961.在长度为2N的数组中找出重复N次的元素
 * so easy~
 */
public class SixtyOne {
    public int repeatedNTimes(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int n : nums) {
            seen.put(n, seen.getOrDefault(n, 0) + 1);
        }
        int flag = nums.length / 2;
        for (int i : seen.keySet()) {
            if (seen.get(i) == flag) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SixtyOne sixtyOne = new SixtyOne();
        int[] nums = new int[]{5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(sixtyOne.repeatedNTimes(nums));
    }
}

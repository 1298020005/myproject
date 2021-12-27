package com.example.myproject.leetcode.easy.twohundred;

import java.util.HashSet;

/**
 * 217. 存在重复元素
 */
public class Seventeen {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num :
                nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Seventeen seventeen = new Seventeen();
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(seventeen.containsDuplicate(nums));
    }
}

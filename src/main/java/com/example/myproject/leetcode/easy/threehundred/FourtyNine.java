package com.example.myproject.leetcode.easy.threehundred;

import java.util.HashSet;

/**
 * 349. 两个数组的交集
 * 自己写的 连个hash表
 */
public class FourtyNine {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> seen2 = new HashSet<>();
        for (int num : nums1) {
            seen.add(num);
        }
        for (int num2 : nums2) {
            if (seen.contains(num2)) {
                seen2.add(num2);
            }
        }
        int[] res = new int[seen2.size()];
        int i = 0;
        for (int num : seen2) {
            res[i++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        FourtyNine fourtyNine = new FourtyNine();
        int[] nums1 = new int[]{4, 7, 9, 7, 6, 7};
        int[] nums2 = new int[]{5, 0, 0, 6, 1, 6, 2, 2, 4};
        System.out.println(fourtyNine.intersection(nums1, nums2));
    }
}

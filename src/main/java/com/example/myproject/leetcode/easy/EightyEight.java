package com.example.myproject.leetcode.easy;

/**
 * 88.合并两个有序数组
 */
public class EightyEight {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[m + n + 1] = nums1[m];
                m--;
            } else {
                nums1[m + n + 1] = nums2[n];
                n--;
            }
        }
        for (int num : nums1) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        EightyEight eightyEight = new EightyEight();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        eightyEight.merge(nums1,3,nums2,3);
    }
}

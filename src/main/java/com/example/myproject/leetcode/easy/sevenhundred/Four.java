package com.example.myproject.leetcode.easy.sevenhundred;

/**
 * 704.二分查找
 * 再看 思想很经典
 */
public class Four {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        Four four = new Four();
        System.out.println(four.search(nums, 2));
    }
}

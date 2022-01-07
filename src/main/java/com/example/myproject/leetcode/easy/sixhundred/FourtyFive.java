package com.example.myproject.leetcode.easy.sixhundred;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 645.错误的集合
 * 建议再看 没做出来
 * 重复的数字在数组中出现 22 次，丢失的数字在数组中出现 00 次，
 * 其余的每个数字在数组中出现 11 次。因此可以使用哈希表记录每个元素在数组中出现的次数，然后遍历从 11 到 nn 的每个数字，分别找到出现 22 次和出现 00 次的数字，即为重复的数字和丢失的数字。
 */
public class FourtyFive {
    public int[] findErrorNums(int[] nums) {
        int[] errorNums = new int[2];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= n; i++) {
            int count = map.getOrDefault(i, 0);
            if (count == 2) {
                errorNums[0] = i;
            } else if (count == 0) {
                errorNums[1] = i;
            }
        }
        return errorNums;
    }
// 1 2 3 3 3
    public static void main(String[] args) {
//        int[] nums = new int[]{3,2,3,4,6,5};
        int[] nums = new int[]{5,3,6,1,5,4,7,8};
        FourtyFive fourtyFive = new FourtyFive();
        fourtyFive.findErrorNums(nums);
    }
}

package com.example.myproject.leetcode.easy.threehundred;

/**
 * 303.区域和检索-数组不可变
 * 再看 构造前缀和
 */
public class three {
    // 前缀和数组
    private int[] preSum;

    /**
     * 根据输入的数组构造前缀和
     * @param nums
     */
    //注意此函数放在leet上为NumArray,此处不同是因为类不同
    public three(int[] nums) {
        // preSum[i] 记录 nums[0..i-1] 的累加和,所以数组长度要+1
        preSum = new int[nums.length+1];
        // 初始化前缀和数组
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i-1] + nums[i-1];
        }
    }
    // 现在计算索引区间的数值之和就简单了，直接用做右边减去左边
    public int sumRange(int left, int right) {
        return preSum[right+1] - preSum[left];
    }
}

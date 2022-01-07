package com.example.myproject.leetcode.easy.sixhundred;

import com.example.myproject.leetcode.easy.fivehundred.Nine;

import java.util.HashMap;
import java.util.Map;

/**
 * 697.数组的度
 * 再看
 * 下面解放是官方的解法,自己只想到用hash表构建 但是长度为3的数组确实没想到
 * 思路:
 * 原数组的度相同的最短连续子数组，必然包含了原数组中的全部 xx，且两端恰为 xx 第一次出现和最后一次出现的位置
 * 因为符合条件的 xx 可能有多个，即多个不同的数在原数组中出现次数相同。
 * 所以为了找到这个子数组，我们需要统计每一个数出现的次数，同时还需要统计每一个数第一次出现和最后一次出现的位置。
 * 在实际代码中，我们使用哈希表实现该功能，每一个数映射到一个长度为 33 的数组，
 * 数组中的三个元素分别代表这个数出现的次数、这个数在原数组中第一次出现的位置和这个数在原数组中最后一次出现的位置。
 * 当我们记录完所有信息后，我们需要遍历该哈希表，找到元素出现次数最多，且前后位置差最小的数
 *
 */
public class NinetySeven {
    public int findShortestSubArray(int[] nums) {
        //key 为nums的值 v为长度为三的数组 分表表示 ①k在nums出现的次数②k在nums第一次出现的位置③k最后出现的位置
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                //value为数组的用法
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                //第一次出现,存入初始值
                map.put(nums[i], new int[]{1, i, i});
            }
        }
        //最大出现次数 前后位置差
        int maxNum = 0, minLen = 0;
        //遍历hash表
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            //注意此处的arr 实际是value 即长度为3的数组 则arr[0] 为nums 元素出现的次数
            int[] arr = entry.getValue();
            // 当前最大出现次数小于 nums元素出现次数时
            if (maxNum < arr[0]) {
                // 最大出现次数替换
                maxNum = arr[0];
                //最小出现长度
                minLen = arr[2] - arr[1] + 1;
            } else if (maxNum == arr[0]) {
                //如果出现次数相等 且当前小长度大于 遍历元素的最小长度
                if (minLen > arr[2] - arr[1] + 1) {
                    minLen = arr[2] - arr[1] + 1;
                }
            }
        }
        return minLen;
    }

    public static void main(String[] args) {
        NinetySeven ninetySeven=new NinetySeven();
        int[] nums=new int[]{1,2,2,3,1,4,2};
        System.out.println(ninetySeven.findShortestSubArray(nums));
    }
}

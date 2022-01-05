package com.example.myproject.leetcode.easy.fivehundred;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 594.最长和谐子序列
 * 用哈希存储 key: 数组值 value:出现次数
 * 然后遍历hash,取出最大
 */
public class NinetyFour {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            //存入hash值,value若不存在默认为0
            temp.put(num, temp.getOrDefault(num, 0) + 1);
        }
        //遍历hash值
        for (int key : temp.keySet()) {
            //包括key
            if (temp.containsKey(key + 1)) {
                res = Math.max(res, temp.get(key) + temp.get(key + 1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};

    }
}

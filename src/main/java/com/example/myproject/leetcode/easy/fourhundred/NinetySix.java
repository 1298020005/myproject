package com.example.myproject.leetcode.easy.fourhundred;

import com.example.myproject.leetcode.easy.twohundred.Ninety;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 496.下一个更大的元素
 * 自己想的,官方题解采用栈+
 */
public class NinetySix {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        //利用hash表存储数组1 用于比较，其中key是数组值，value是下表
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            seen.put(nums1[i], i);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (seen.containsKey(nums2[i])) {
                //最后一位则直接复制-1
                if (i != nums2.length - 1) {
                    //遍历 从相同下表i 右侧所有元素 看是否有相同的
                    for (int j = i + 1; j < nums2.length; j++) {
                        if (nums2[i] < nums2[j]) {
                            res[seen.get(nums2[i])] = nums2[j];
                            break;
                        }
                        res[seen.get(nums2[i])] = -1;
                    }
                } else {
                    res[seen.get(nums2[i])] = -1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NinetySix ninetySix = new NinetySix();
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        ninetySix.nextGreaterElement(nums1, nums2);
    }
}

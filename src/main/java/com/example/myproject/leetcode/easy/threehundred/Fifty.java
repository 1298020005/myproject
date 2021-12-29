package com.example.myproject.leetcode.easy.threehundred;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 350.两个数组的交集 2
 * 那官方代码，自己写的注释,可以再看
 */
public class Fifty {
    public int[] intersect(int[] nums1, int[] nums2) {
        // 传入map为数据较小的数组,有助于减小时间复杂度
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //创建map key 为 数组的值 value 为出现的次数
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] res = new int[nums1.length];
        int index = 0;
        //将map值加入数组中
        for (int num : nums2) {
            //获得num在map中的出现次数,如果没有则为默认值0
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                //赋值给结果函数
                res[index++] = num;
                //赋值成功时减少 原map中 num的出现次数 然后判断count 值看是否多次出现
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        // res 数组定义长度为 原始map长度 与349 题不通，最终结果不一定是此长度，为实际int 长度
        // 此方法作用为 截取res数组从下表0到index 返回一个新数组
        return Arrays.copyOfRange(res, 0, index);
    }

    public static void main(String[] args) {
        Fifty fifty=new Fifty();
        int[] nums1 = new int[]{4, 7, 9, 7, 6, 7};
        int[] nums2 = new int[]{5, 0, 0, 6, 1, 6, 2, 2, 4};
        fifty.intersect(nums1,nums2);
    }
}

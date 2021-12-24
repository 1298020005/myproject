package com.example.myproject.leetcode.easy.onehundred;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 169. 多数元素
 * 官方方法有很多种
 * 最简洁的是 利用众数校验的
 * 其次是哈希
 * 必要看
 */
public class SixtyNine {

    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        int  maxNum= Integer.parseInt(gerMinValue(counts).toString());
        int key = Integer.parseInt(getKey(counts,maxNum).toString());
return key;
//        return majorityEntry.getKey();
    }

    //根据最大value寻找key
    private static Object getKey(Map<Integer,Integer> map,Integer value){
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(value == entry.getValue()){
                key=entry.getKey();
            }
        }
        return key;
    }

    //遍历寻找最大value
    private static Object gerMinValue(Map<Integer, Integer> map) {
        if (map.size() == 0)
            return null;
        Collection<Integer> c = map.values();
        Object[] obj = c.toArray();
        Arrays.sort(obj);
        return obj[obj.length - 1];
    }
//    // 太赞了,简洁无比
//    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }

    public static void main(String[] args) {
        SixtyNine sixtyNine = new SixtyNine();
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(sixtyNine.majorityElement(nums));
    }
}

package com.example.myproject.leetcode.easy.twohundred;

import com.example.myproject.leetcode.easy.onehundred.Ninety;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 219.存在相同元素
 * 需要再看 体悟这个解法,太妙了
 */
public class Nineteen {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        //维护一个哈希表，里面始终最多包含 k 个元素，当出现重复值时则说明在 k 距离内存在重复元素
        //每次遍历一个元素则将其加入哈希表中，如果哈希表的大小大于 k，则移除最前面的数字
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Nineteen nineteen=new Nineteen();
//        System.out.println(nineteen.containsNearbyDuplicate());
    }
}

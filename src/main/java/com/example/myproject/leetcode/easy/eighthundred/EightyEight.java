package com.example.myproject.leetcode.easy.eighthundred;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 888.公平的糖果交换
 * 可以再看
 */
public class EightyEight {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // 统计 两人各自糖果总和
        int sumA = Arrays.stream(aliceSizes).sum();
        int sumB = Arrays.stream(bobSizes).sum();
        // 两人糖果和除2
        int delta = (sumA - sumB) / 2;
        // 记录 a的糖果 没必要记录重复
        Set<Integer> rec = new HashSet<Integer>();
        for (int num : aliceSizes) {
            rec.add(num);
        }
        //结果集合
        int[] res = new int[2];
        for (int y : bobSizes) {
            // 由数学  sumA -x + y= sumB  + x -y 推导得出
            int x = y + delta;
            //如果 x存在  则是所求答案(注意答案不唯一)
            if (rec.contains(x)) {
                res[0] = x;
                res[1] = y;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        EightyEight eightyEight = new EightyEight();
        int[] aliceSizes = new int[]{1, 2, 5};
        int[] bobSizes = new int[]{2, 4};
        System.out.println(eightyEight.fairCandySwap(aliceSizes, bobSizes));
    }
}

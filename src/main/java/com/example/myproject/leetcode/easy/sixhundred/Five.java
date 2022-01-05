package com.example.myproject.leetcode.easy.sixhundred;

/**
 * 605.种花问题
 * 建议再看,解题思路出现了问题
 * 之前的解题思路是判断总数是否合格(例如总数12个要插入n个),但是用n是否被使用完毕更合适
 * n如果可以被插入完毕,证明
 */
public class Five {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        /**
         * 能种花的地方
         * ①当前位置没有花
         * ②前面要么没有花, 要么是边界
         * ③后面要么没有花, 要么是边界
         */
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                n--;
                //把花种上
                flowerbed[i] = 1;
            }
            if (n <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Five five = new Five();
        int[] flowerbed = new int[]{1, 0, 0, 0, 0, 1};
        System.out.println(five.canPlaceFlowers(flowerbed, 2));
    }
}

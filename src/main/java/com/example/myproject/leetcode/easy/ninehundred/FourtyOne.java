package com.example.myproject.leetcode.easy.ninehundred;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 941.有效的山脉数组
 * 可以再看 自己实现的方法
 * 时空复杂度很糟糕,官方的比较优秀
 */
public class FourtyOne {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int flag = 0;
        boolean res;
        if (arr[0] == max) {
            return false;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != max && flag == 0) {
                //递增逻辑
                if (arr[i] <= arr[i - 1]) return false;
            } else if (arr[i] == max && flag == 0) {
                //找到 0的位置
                flag = 1;
            } else if (arr[i] != max && flag == 1) {
                //递减逻辑
                if (arr[i] >= arr[i - 1]) return false;
            } else {
                return false;
            }
        }
        return arr[arr.length - 1] < arr[arr.length - 2];
    }

    public static void main(String[] args) {
        FourtyOne fourtyOne = new FourtyOne();
        int[] arr = new int[]{4, 4, 3, 2, 1};
        System.out.println(fourtyOne.validMountainArray(arr));
    }
}

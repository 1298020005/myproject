package com.example.myproject.leetcode.easy.eighthundred;

public class FiftyTwo {
    public int peakIndexInMountainArray(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1] || i == arr.length - 1) {
                return i;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        FiftyTwo fiftyTwo = new FiftyTwo();
        System.out.println(fiftyTwo.peakIndexInMountainArray(arr));
    }
}

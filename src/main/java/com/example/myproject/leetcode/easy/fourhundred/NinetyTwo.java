package com.example.myproject.leetcode.easy.fourhundred;

/**
 * 492.构造矩形
 */
public class NinetyTwo {
    public int[] constructRectangle(int area) {
        //area 可以被 W 整除 又尽可能接近
        int w = (int) Math.sqrt(area);
        //如果可以整除跳出循环
        while (area % w != 0) {
            --w;
        }
        return new int[]{area / w, w};
    }

    public static void main(String[] args) {
        NinetyTwo ninetyTwo=new NinetyTwo();
        System.out.println(ninetyTwo.constructRectangle(15));
    }
}

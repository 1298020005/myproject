package com.example.myproject.leetcode.easy.eighthundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 830.较大分组的位置
 * 可以再看 一半自己想的
 */
public class Thirty {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        //flag 用于记录出现了几次 start end 用于记录下标
        int flag = 1, start = 0, end = 1;
        for (int i = 0; i < s.length(); i++) {
            // 如果是 最后一个字符 或者 与后一个字符不相等
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                //更新 开始坐标 与 标识 字段  并判断是否要塞入res结果集合中
                if (flag >= 3) {
                    //另一种写法  更简洁 不用自己建立了
                    //res.add(Arrays.asList(start, end));
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(start);
                    temp.add(end);
                    res.add(temp);
                }
                start = i + 1;
                flag = 1;
            } else {
                flag++;
                end = i + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Thirty thirty = new Thirty();
        System.out.println(thirty.largeGroupPositions("ddd"));
    }
}

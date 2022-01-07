package com.example.myproject.leetcode.easy.sixhundred;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 682.棒球比赛
 * 时空复杂度很糟糕
 * 建议再看 官方使用了栈的做法
 * 可以自己写一哈
 */
public class EightyTwo {
    public int calPoints(String[] ops) {
        //res 集合存储 分数记录
        ArrayList<Integer> res=new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            String c = ops[i];
            int size=res.size();
            switch (c) {
                case "C":
                    res.remove(size-1);
                    break;
                case "D":
                    res.add(res.get(size-1)*2);
                    break;
                case "+":
                    res.add(res.get(size-1)+res.get(size-2));
                    break;
                default:
                    res.add(Integer.parseInt(c));
            }
        }
        // 分数记录求和
        return res.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        String[] ops = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        EightyTwo eightyTwo = new EightyTwo();
        System.out.println(eightyTwo.calPoints(ops));
    }
}

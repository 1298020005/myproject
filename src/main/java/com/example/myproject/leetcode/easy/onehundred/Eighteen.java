package com.example.myproject.leetcode.easy.onehundred;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 完全自己解决的哦 没去看题解中更好的解法
 */
public class Eighteen {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        res1.add(1);
        res.add(res1);
        if (numRows == 1) {
            return res;
        }
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        pre.add(1);
        res.add(pre);
        if (numRows == 2) {
            return res;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            Integer left = null;
            cur.add(1);
            for (Integer p : pre) {
                if (left == null) {
                    left = p;
                } else {
                    cur.add(left + p);
                    left = p;
                }
            }
            cur.add(1);
            pre = cur;
            res.add(cur);
        }
        return res;
    }

    public static void main(String[] args) {
        Eighteen eighteen = new Eighteen();
        eighteen.generate(5);
    }
}

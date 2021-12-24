package com.example.myproject.leetcode.easy.onehundred;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. 杨辉三角
 * 完全自己解决的哦
 */
public class Nineteen {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        res1.add(1);
        res.add(res1);
        if (rowIndex == 0) {
            return res.get(1);
        }
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        pre.add(1);
        res.add(pre);
        if (rowIndex == 1) {
            return res.get(2);
        }
        for (int i = 2; i <= rowIndex; i++) {
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
       return res.get(rowIndex);
    }


    public static void main(String[] args) {
        Nineteen eighteen = new Nineteen();
        eighteen.getRow(5);
    }
}

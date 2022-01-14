package com.example.myproject.leetcode.easy.ninehundred;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 989.数组形式的整数加法
 * 建议再看:逐位加法
 * 我的思路 是 num先变成数字,事实上这种方法存在问题,int 数会超出,long等同理
 * 所以官方方法比较好
 */
public class EightyNine {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<Integer>();
        int n = num.length;
        for (int i = n - 1; i >= 0; --i) {
            //sum为每一位要加的数
            int sum = num[i] + k % 10;
            //k 进位
            k /= 10;
            if (sum >= 10) {
                k++;
                sum -= 10;
            }
            res.add(sum);
        }
        //因为从右像左遍历,第一 需要额外判断
        for (; k > 0; k /= 10) {
            res.add(k % 10);
        }
        //反转
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int[] num=new int[]{9,9,9,9,9,9,9,9,9,9};
        EightyNine eightyNine=new EightyNine();
        System.out.println(eightyNine.addToArrayForm(num,1));
    }
}

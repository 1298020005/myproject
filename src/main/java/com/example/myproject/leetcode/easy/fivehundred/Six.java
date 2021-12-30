package com.example.myproject.leetcode.easy.fivehundred;

import com.example.myproject.leetcode.utils.PrintArray;

import java.util.Arrays;
import java.util.HashMap;

import static com.example.myproject.leetcode.utils.PrintArray.PrintArrayString;

/**
 * 506.相对名次
 * 建议再看
 * 看了宫水三叶的题解,呜呜呜,我是fw
 */
public class Six {
    public String[] findRelativeRanks(int[] score) {
        //数组长度
        int length = score.length;
        //用字符数组的下标来标识,下标与内容对应
        String[] ss = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        //克隆新数组 用作排序后像map传入数据
        int[] clone = score.clone();
        Arrays.sort(clone);
        //构建map key 为对应分数 value 为分数对应的排名
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < length; i++) {
            seen.put(clone[length - i - 1], i);
        }
        String[] res = new String[length];
        for (int i = 0; i < length; i++) {
            int rank = seen.get(score[i]);
            //下列代码是错误的
//            res[i] = rank >= 3 ? String.valueOf(i + 1) : ss[i];
            res[i] = rank < 3 ? ss[rank] : String.valueOf(rank + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Six six = new Six();
        int[] score = new int[]{10, 3, 8, 9, 4};
        PrintArrayString(six.findRelativeRanks(score));
    }
}

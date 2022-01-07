package com.example.myproject.leetcode.easy.eighthundred;

/**
 * 821.字符的最短距离
 * 建议再看
 * 思路:
 * 找出距离向左或向右下一个字符c 的距离,答案是两个值的较小值
 */
public class TwentyOne {
    public int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] ans = new int[N];
        //上一个字符出现的位置
        int prev = Integer.MIN_VALUE / 2;
        //从左向右遍历,记录上一个字符出现的位置
        for (int i = 0; i < N; ++i) {
            //如果等于 判别字符c 则 更改 上一次出现的位置
            if (S.charAt(i) == C) prev = i;

            //永远是 减去上一次字符出现的位置,即为最小位置
            ans[i] = i - prev;
        }
        //从右像左遍历
        prev = Integer.MAX_VALUE / 2;
        for (int i = N - 1; i >= 0; --i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }
        return ans;
    }

    public static void main(String[] args) {
        TwentyOne twentyOne = new TwentyOne();
        for (int i : twentyOne.shortestToChar("aaab", 'b')) {
            System.out.println(i);
        }
    }
}

package com.example.myproject.leetcode.easy.fourhundred;

/**
 * 495.提莫攻击
 * 官方解法是 计算每次攻击后 一小段时间 产生结果相加总和
 * 我是采用间隔 开始中毒到中毒结束的时间总和
 */
public class NinetyFive {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        int length = timeSeries.length;
        //end start 分别记录 在没有中断 情况下的开始和结束时间 比如duration=3 [1,3,8,11]  会有两个 两个start end
        int start = timeSeries[0], end = timeSeries[0] + duration - 1;
        for (int i = 0; i < length; i++) {
            if (timeSeries[i] <= end) {

            } else {
                res += end - start + 1;
                start = timeSeries[i];
            }
            end = timeSeries[i] + duration - 1;
        }
        //最后一个数没有技术，所以需要在执行一次
        res += end - start + 1;
        return res;
    }

    public static void main(String[] args) {
        NinetyFive ninetyFive = new NinetyFive();
        int[] timeSeries = new int[]{1, 2, 7};
        System.out.println(ninetyFive.findPoisonedDuration(timeSeries, 2));
    }
}

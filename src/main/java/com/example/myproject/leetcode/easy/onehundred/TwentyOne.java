package com.example.myproject.leetcode.easy.onehundred;

/**
 * 121.买卖股票的最佳时机
 * 暴力破解是没有提示完全自己想的，理论上可以，但是leetcode 测试用例太长所以超时间
 * 于是有了第二种。
 */
public class TwentyOne {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                //最低点的价格
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                //最大的利润 ps 两个if 不可能同时满足 因为 满足条件1时 条件而 >左边一定小于0 而 maxprofit 大于0
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

//    //暴力破解
//    public int maxProfit(int[] prices) {
//        int res=0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i+1; j < prices.length; j++) {
//                if(prices[i]<prices[j]){
//                    int max=prices[j]-prices[i];
//                    res=res>max?res:max;
//                }
//            }
//        }
//        return  res;
//    }

    public static void main(String[] args) {
        TwentyOne twentyOne = new TwentyOne();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(twentyOne.maxProfit(prices));
    }
}

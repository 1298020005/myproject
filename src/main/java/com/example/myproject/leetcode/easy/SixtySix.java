package com.example.myproject.leetcode.easy;

/**
 *  我的解法比较蠢 并且还未曾实现
 *  别人的解法非常巧妙
 *  建议再回顾一下此题
 */
public class SixtySix {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

//        //我的笨蛋解法
//        int res = 0;
//        int results[] = new int[digits.length + 1];
//        for (int digit : digits) {
//            if(res==0){
//                res=digit;
//            }else {
//                res=res*10+digit;
//            }
//        }
//        res++;
//        for (int i = 0; i < results.length; i++) {
//            results[i]=res%10;
//            res=res/10;
//        }
//        return results;
    }

    public static void main(String[] args) {
        SixtySix sixtySix = new SixtySix();
        int[] nums = new int[]{1, 2, 3};
        int[] result = sixtySix.plusOne(nums);
        for (int res : result) {
            System.out.println(res);
        }
    }
}

package com.example.myproject.leetcode.easy.sixhundred;

import com.example.myproject.leetcode.easy.onehundred.TwentyFive;

/**
 * 680.验证回文字符串②
 * 类比 125.验证回文串 409.最长回文串
 * 一定再看
 * 存疑 为什么时间复杂度 官方是 o(n)
 */
public class Eighty {
    //官方思路是利用双指针 在左右指针分别匹配 如果相同 同时 像中间靠拢 如果不相同 则 左或右 有一个像中间靠拢 只要有一个满足条件 就是正确答案
    public boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        //当左右指针未靠拢到中间时
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            //如果 左右相等 即为正常回文 不相等 有一次机会尝试
            if (c1 == c2) {
                ++low;
                --high;
            } else {
                //删除左或删除右边,有一个满足条件即可
                return validPalindrome(s, low, high - 1) || validPalindrome(s, low + 1, high);
            }
        }
        return true;
    }

    public boolean validPalindrome(String s, int low, int high) {
        // 验证删除后的子串是否为回文串
        for (int i = low, j = high; i < j; ++i, --j) {
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
//    //我自己的方法 超出时间限制了 可以解决  思路为枚举每一个位置作为被删除的位置，再判断剩下的字符串是否是回文串,时间复杂度为 o(n2)
//    public boolean validPalindrome(String s) {
//        TwentyFive twentyFive=new TwentyFive();
//        for (int i = 0; i < s.length(); i++) {
//            String temp=s.substring(0,i)+s.substring(i+1,s.length());
//            if (twentyFive.isPalindrome(temp)){
//                return  true;
//            }
//        }
//        return false;
//    }


    public static void main(String[] args) {
        Eighty eighty = new Eighty();
        System.out.println(eighty.validPalindrome("abc"));
    }
}

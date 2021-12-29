package com.example.myproject.leetcode.easy.fourhundred;

import java.util.HashMap;
import java.util.Map;

/**
 * 409.最长回文串
 * 建议再看,使用数组就可以解决，我的时空复杂度只击败了百分之16
 */
public class Nine {
    public int longestPalindrome(String s) {
        int res = 0;
        int flag = 0;
        HashMap<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            seen.put(s.charAt(i), seen.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : seen.entrySet()) {
            //每次会增加 value / 2 * 2，因此 res 每次增加都一直为偶数
            res += entry.getValue() / 2 * 2;
            //判定是否有奇数,并且只增加一次
            if (entry.getValue() % 2 == 1 && res % 2 == 0) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Nine nine = new Nine();
        System.out.println(nine.longestPalindrome("abccccdd"));
    }
}

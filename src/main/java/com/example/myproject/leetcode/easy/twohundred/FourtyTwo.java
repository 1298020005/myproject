package com.example.myproject.leetcode.easy.twohundred;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 242.有效的字母异位词
 */
public class FourtyTwo {
    //排序法t 是 ss 的异位词等价于「两个字符串排序后相等」。
    // 因此我们可以对字符串 ss 和 tt 分别排序，看排序后的字符串是否相等即可判断。
    // 此外，如果 ss 和 tt 的长度不同，tt 必然不是 ss 的异位词。
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    // 此法为哈希法 不像我一开始像的 做两个哈希值
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> table = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }
        // ①已经比较过 两个字符串的位数了 ②位数相同 如果有不同字母 则 table 表减去后必有负数
        // 如 asd abd  左减右 有个负字符 b
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) - 1);
            if (table.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FourtyTwo fourtyTwo = new FourtyTwo();
        System.out.println(fourtyTwo.isAnagram("anagram", "nagaram"));
    }
}

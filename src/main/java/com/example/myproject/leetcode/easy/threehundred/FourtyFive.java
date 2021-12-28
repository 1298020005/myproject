package com.example.myproject.leetcode.easy.threehundred;

import java.util.HashSet;
import java.util.Set;

/**
 * 345.反转字符串中的元音字母
 * 再看
 * 利用「双指针」进行前后扫描，当左右指针都是元音字母时，进行互换并移到下一位。
 * 由于元音字母相对固定，因此我们可以使用容器将其存储，并使用 static 修饰，确保整个容器的创建和元音字母的填入在所有测试样例中只会发生一次。
 *
 * 我们期望该容器能在 O(1)O(1) 的复杂度内判断是否为元音字母，可以使用语言自带的哈希类容器（P2P2 代码）或是使用数组模拟（P1P1 代码）。
 *
 * 一些细节：由于题目没有说字符串中只包含字母，因此在使用数组模拟哈希表时，我们需要用当前字符减去 ASCII 码的最小值（空字符），而不是 'A'
 */
public class FourtyFive {
    static char[] vowels = new char[]{'a','e','i','o','u'};
    static Set<Character> set = new HashSet<>();
    static {
        for (char c : vowels) {
            set.add(c);
            set.add(Character.toUpperCase(c));
        }
    }
    public String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        int n = s.length();
        int l = 0, r = n - 1;
        while (l < r) {
            if (set.contains(cs[l]) && set.contains(cs[r])) {
                swap(cs, l++, r--);
            } else {
                if (!set.contains(cs[l])) l++;
                if (!set.contains(cs[r])) r--;
            }
        }
        return String.valueOf(cs);
    }
    void swap(char[] cs, int l, int r) {
        char c = cs[l];
        cs[l] = cs[r];
        cs[r] = c;
    }
    public static void main(String[] args) {
        FourtyFive fourtyFive = new FourtyFive();
        System.out.println(fourtyFive.reverseVowels("leetcode"));
    }
}

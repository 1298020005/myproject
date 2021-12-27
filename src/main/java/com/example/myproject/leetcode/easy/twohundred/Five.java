package com.example.myproject.leetcode.easy.twohundred;

import java.util.HashMap;
import java.util.Map;

/**
 * 205.同构字符串
 * 对于这道题，我们只需要验证 s - > t 和 t -> s 两个方向即可。如果验证一个方向，是不可以的。
 * 举个例子，s = ab, t = cc，如果单看 s -> t ，那么 a -> c, b -> c 是没有问题的。
 * 必须再验证 t -> s，此时，c -> a, c -> b，一个字母对应了多个字母，所以不是同构的。
 *
 *
 */
public class Five {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<Character, Character>();
        Map<Character, Character> t2s = new HashMap<Character, Character>();
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }
    // 时间复杂度高但是简洁的做法
    /**
     * 最前索引比较
     */
//    public boolean isIsomorphic(String s, String t) {
//        for (int i = 0; i < s.length(); i++)
//            //indexOf方法返回第一个指定元素出现的下标,若两个字符串中出现了下标不一致的情况则说明一定有某个字符串的字符出现了两次以上
//            //取当前位置字符第一次出现的索引对比
//            //情况1(一个字符映射多个): foo 与 bar, 处理第二个o时发现索引不同
//            //情况2(多个字符映射同个): abc 与 ggl, 处理第二个g时发现索引不同
//            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        Five five = new Five();
        System.out.println(five.isIsomorphic("egg", "add"));
    }
}

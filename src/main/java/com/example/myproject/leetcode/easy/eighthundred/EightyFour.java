package com.example.myproject.leetcode.easy.eighthundred;

import java.util.*;

/**
 * 884.两句话中的不常见单词
 * 思路:每个不常见的单词总共只出现一次。我们可以统计每个单词的出现次数，然后返回恰好出现一次的单词。
 */
public class EightyFour {
    public String[] uncommonFromSentences(String s1, String s2) {
        //构建hashmap 统计单词出现次数
        HashMap<String, Integer> count = new HashMap();
        for (String word : s1.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        for (String word : s2.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        List<String> res = new LinkedList();
        for (String word : count.keySet()) {
            if (count.get(word) == 1)
                res.add(word);
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        EightyFour eightyFour = new EightyFour();
        System.out.println(eightyFour.uncommonFromSentences("apple apple", "banana"));
    }
}

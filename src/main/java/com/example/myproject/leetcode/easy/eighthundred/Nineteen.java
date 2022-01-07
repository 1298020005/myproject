package com.example.myproject.leetcode.easy.eighthundred;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 819.最常见的单词
 * 建议再看
 */
public class Nineteen {
    public String mostCommonWord(String paragraph, String[] banned) {
        //为了让最后一个单词也触发判断，如果段落最后一位是字母，不加的话会在最后一个单词遍历完之后退出循环
        paragraph += ".";
        //创建禁用列表
        HashSet<String> ban = new HashSet<>();
        HashMap<String, Integer> res = new HashMap<>();
        for (String b : banned) {
            ban.add(b);
        }
        String ans = "";
        int ansfreq = 0;
        StringBuilder temp = new StringBuilder();
        //遍历所需要单词
        for (char c : paragraph.toCharArray()) {
            //如果单词是字母 排除空格和标点符号
            if (Character.isLetter(c)) {
                //放入
                temp.append(Character.toLowerCase(c));
            } else if (temp.length() > 0) {
                String finalword = temp.toString();
                //如果不在禁用表中
                if (!ban.contains(finalword)) {
                    // key 为 所存单词 value为出现次数
                    res.put(finalword, res.getOrDefault(finalword, 0) + 1);
                    //答案单词出现次数
                    if (res.get(finalword) > ansfreq) {
                        ans = finalword;
                        ansfreq = res.get(finalword);
                    }
                }
                temp = new StringBuilder();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Nineteen nineteen = new Nineteen();
        String[] banned = new String[]{"hit"};
        System.out.println(nineteen.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", banned));
    }
}

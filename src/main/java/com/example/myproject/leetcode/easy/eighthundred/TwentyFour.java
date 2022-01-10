package com.example.myproject.leetcode.easy.eighthundred;

import java.util.HashSet;
import java.util.Set;

/**
 * 824.山羊拉丁文
 * 建议再看 再整理 那得官方的
 */
public class TwentyFour {
    public String toGoatLatin(String sentence) {
        //构造hash set 集合,校验是否为元音字母
        HashSet<Character> vowel = new HashSet();
        for (char c : new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'})
            vowel.add(c);
        //用 flag来记录
        int flag = 1;
        StringBuilder ans = new StringBuilder();
        for (String word : sentence.split(" ")) {
            char first = word.charAt(0);
            if (vowel.contains(first)) {
                ans.append(word);
            } else {
                //从下表1 开始到他的结束
                ans.append(word.substring(1));
                ans.append(word.substring(0, 1));
            }
            ans.append("ma");
            for (int i = 0; i < flag; i++)
                ans.append("a");
            flag++;
            ans.append(" ");
        }
        //作用在于清楚最后的空格
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }

    public static void main(String[] args) {
        TwentyFour twentyFour = new TwentyFour();
        System.out.println(twentyFour.toGoatLatin("I speak Goat Latin"));
    }
}

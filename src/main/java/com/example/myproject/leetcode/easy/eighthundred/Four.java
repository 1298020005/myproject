package com.example.myproject.leetcode.easy.eighthundred;

import java.util.HashSet;
import java.util.Set;

/**
 * 804.唯一莫斯密码
 * 可以再看 虽然是官网的,但是不生很难
 * 注意 用数组代替hash
 * 因为26个字母 正好是数组下标对应
 * 思路:
 * 我们将数组 word 中的每个单词转换为摩尔斯码，
 * 并加入哈希集合（HashSet）中，最终的答案即为哈希集合中元素的个数。
 */
public class Four {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }
        return seen.size();
    }

    public static void main(String[] args) {
        String[] words=new String[]{"gin", "zen", "gig", "msg"};
        Four four=new Four();
        System.out.println(four.uniqueMorseRepresentations(words));
    }

}

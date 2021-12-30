package com.example.myproject.leetcode.easy.fivehundred;

import java.util.ArrayList;
import java.util.List;

/**
 * 500.键盘行
 * 我只能想到hashmap 官方的这种处理方式太秀了
 * 宫水三叶有一种 out for continue方式 建议再看
 */
public class Zero {
    public String[] findWords(String[] words) {
        //不确定最终数组长度 先试用list
        List<String> list = new ArrayList<String>();
        //预处理计算出每个字符对应的行号
        String rowIdx = "12210111011122000010020202";
        for (String word : words) {
            boolean isValid = true;
            //遍历字符串时，统一将大写字母转化为小写字母方便计算。
            char idx = rowIdx.charAt(Character.toLowerCase(word.charAt(0)) - 'a');
            for (int i = 1; i < word.length(); ++i) {
                //每次和第一个字符串进行比较
                if (rowIdx.charAt(Character.toLowerCase(word.charAt(i)) - 'a') != idx) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                list.add(word);
            }
        }
        String[] ans = new String[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Zero zero=new Zero();
        String[] words=new String[]{"Hello","Alaska","Dad","Peace"};
        zero.findWords(words);
    }
}

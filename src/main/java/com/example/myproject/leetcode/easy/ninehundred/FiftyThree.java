package com.example.myproject.leetcode.easy.ninehundred;

/**
 * 953.验证外星语单词
 * 建议再看 状态不佳当时没看了
 */
public class FiftyThree {
    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0; i < order.length(); ++i)
            index[order.charAt(i) - 'a'] = i;
        //用于多层for 循环的情况下定位使用,让conuinue 退出到这个for循环
        search: for (int i = 0; i < words.length - 1; ++i) {
            String word1 = words[i];
            String word2 = words[i+1];

            // Find the first difference word1[k] != word2[k].
            for (int k = 0; k < Math.min(word1.length(), word2.length()); ++k) {
                if (word1.charAt(k) != word2.charAt(k)) {
                    // If they compare badly, it's not sorted.
                    if (index[word1.charAt(k) - 'a'] > index[word2.charAt(k) - 'a'])
                        return false;
                    continue search;
                }
            }

            // If we didn't find a first difference, the
            // words are like ("app", "apple").
            if (word1.length() > word2.length())
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        FiftyThree fiftyThree=new FiftyThree();
        String[] words=new String[]{"apple","app"};
        System.out.println(fiftyThree.isAlienSorted(words,"abcdefghijklmnopqrstuvwxyz"));
    }
}

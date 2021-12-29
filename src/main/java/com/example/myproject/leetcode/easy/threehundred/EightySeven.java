package com.example.myproject.leetcode.easy.threehundred;

import java.util.HashMap;

/**
 * 387.字符串中第一个唯一字符
 */
public class EightySeven {
    public int firstUniqChar(String s) {
        char[] chars=s.toCharArray();
        HashMap<Character,Integer> seen=new HashMap<>();
        for (Character c:chars){
            int count=seen.getOrDefault(c,0);
            seen.put(c,++count);
        }
        for (int i = 0; i < s.length(); i++) {
            if(seen.getOrDefault(s.charAt(i),0)==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        EightySeven eightySeven=new EightySeven();
        System.out.println(eightySeven.firstUniqChar("loveleetcode"));
    }
}

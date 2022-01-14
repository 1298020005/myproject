package com.example.myproject.leetcode.easy.ninehundred;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * 942.增减字符串匹配
 * 全独立解决,但是读题理解错误  我的解法思路没问题 但是因为超出时间限制,建议参考官方题解
 * 题目的意思是只要左比右即可,而我理解的是做必右都要小,即题目可能多种答案,而我是唯一答案。
 * 原题目的解法 只需要有一个队列 然后依次从两边取值即可
 * 而我的思路是
 * ①构建列表 从右像左 赋值初值
 * ②从右向左遍历s字符串 当 遇见时 I时 减去 1 D时 加 1(判重复)
 * ③转换并找到最小值min 如果小于 0 数组所有数加上最小值的绝对值
 */
public class FourtyTwo {
    public int[] diStringMatch(String s) {
        ArrayList<Integer> seen =new ArrayList<>();
        int end=0;
        seen.add(end);
        //-2 2 -1 1 0
        //从右像左遍历
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                while (seen.contains(end)){
                    end--;
                }
            } else {
                while (seen.contains(end)){
                   end++;
                }
            }
            seen.add(end);
        }
        Collections.reverse(seen);
        int[] num = seen.stream().mapToInt(Integer::valueOf).toArray();
        int min=Arrays.stream(num).min().getAsInt();
        if (min<0){
            for (int i = 0; i < num.length; i++) {
                num[i]+=(-min);
            }
        }
         return  num;
    }

    public static void main(String[] args) {
        FourtyTwo fourtyTwo = new FourtyTwo();
        System.out.println(fourtyTwo.diStringMatch("DDI"));
        //3,2,0,1
    }
}

package com.example.myproject.leetcode.easy.sixhundred;

import java.util.HashMap;

/**
 * 657.机器人是否能返回原点
 * 可以再看 不用使用hash的方法
 */
public class FiftySeven {
    public boolean judgeCircle(String moves) {
        HashMap<Character, Integer> count = new HashMap<>();
        count.put('R', 1);
        count.put('L', 1);
        count.put('U', 1);
        count.put('D', 1);
        for (Character c : moves.toCharArray()) {
            switch (c) {
                case 'R':
                    count.put('R', count.getOrDefault('R', 0) + 1);
                    break;
                case 'L':
                    count.put('L', count.getOrDefault('L', 0) + 1);
                    break;
                case 'U':
                    count.put('U', count.getOrDefault('U', 0) + 1);
                    break;
                case 'D':
                    count.put('D', count.getOrDefault('D', 0) + 1);
                    break;
            }
        }
        if (!count.get('R').equals(count.get('L'))) {
            return false;
        }
        if (!count.get('U').equals(count.get('D'))) {
            return false;
        }
        return true;
    }
    //不使用hash
//    public boolean judgeCircle(String moves) {
//        int x = 0, y = 0;
//        int length = moves.length();
//        for (int i = 0; i < length; i++) {
//            char move = moves.charAt(i);
//            if (move == 'U') {
//                y--;
//            } else if (move == 'D') {
//                y++;
//            } else if (move == 'L') {
//                x--;
//            } else if (move == 'R') {
//                x++;
//            }
//        }
//        return x == 0 && y == 0;
//    }

    public static void main(String[] args) {
        FiftySeven fiftySeven = new FiftySeven();
        System.out.println(fiftySeven.judgeCircle("UD"));
    }
}

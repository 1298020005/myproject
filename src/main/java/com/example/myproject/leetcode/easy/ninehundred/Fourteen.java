package com.example.myproject.leetcode.easy.ninehundred;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 914.卡牌分组
 */
public class Fourteen {
    public boolean hasGroupsSizeX(int[] deck) {
        int length = deck.length;
        Arrays.sort(deck);
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int d : deck) {
            seen.put(d, seen.getOrDefault(d, 0) + 1);
        }
        for (int i = 2; i <= length; i++) {
            if (length % i == 0) {
                boolean flag = true;
                for (int key : seen.keySet()) {
                    if (seen.get(key) % i != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] deck = new int[]{1, 1};
        Fourteen fourteen = new Fourteen();
        System.out.println(fourteen.hasGroupsSizeX(deck));
    }
}

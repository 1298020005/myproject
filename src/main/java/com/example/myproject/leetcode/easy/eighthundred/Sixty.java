package com.example.myproject.leetcode.easy.eighthundred;

import java.util.HashMap;

/**
 * 860.柠檬水找零
 * 自己搞定的呜呜呜
 */
public class Sixty {
    public boolean lemonadeChange(int[] bills) {
        int[] count = new int[3];
        for (int bill : bills) {
            switch (bill) {
                case 5:
                    count[0]++;
                    break;
                case 10:
                    count[1]++;
                    if (count[0] < 1) {
                        return false;
                    }
                    count[0]--;
                    break;
                case 20:
                    count[2]++;
                    // 0 元和10 元有一个没有  或者 没有三个五元
                    if ((count[0] < 1 || count[1] < 1) && count[0] < 3) {
                        return false;
                    } else if (count[0] > 0 && count[1] > 0) {
                        count[0]--;
                        count[1]--;
                    } else {
                        count[0] -= 3;
                    }
                    break;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Sixty sixty = new Sixty();
        int[] bills = new int[]{5,5,10,10,5,20,5,10,5,5};
        System.out.println(sixty.lemonadeChange(bills));
    }
}

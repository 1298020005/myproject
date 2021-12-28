package com.example.myproject.leetcode.easy.twohundred;

/**
 * 292. Nim 游戏
 * 再看 宫水三叶的推理演绎法
 */
public class NinetyTwo {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        NinetyTwo ninetyTwo=new NinetyTwo();
        System.out.println(ninetyTwo.canWinNim(4));
    }
}

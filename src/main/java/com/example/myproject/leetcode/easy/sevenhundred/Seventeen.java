package com.example.myproject.leetcode.easy.sevenhundred;

/**
 * 717.1比特和2比特字符
 * 建议再看
 * 我们可以对 bits 数组从左到右扫描来判断最后一位是否为一比特字符。当扫描到第 ii 位时，
 * 如果[i]=1bits[i]=1，那么说明这是一个两比特字符，将 ii 的值增加 2。
 * 如果[i]=0bits[i]=0，那么说明这是一个一比特字符，将 ii 的值增加 1。
 *
 * 如果 ii 最终落在了{length}-1bits.length−1 的位置，那么说明最后一位一定是一比特字符。
 */
public class Seventeen {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }

    public static void main(String[] args) {
        Seventeen seventeen=new Seventeen();
        int[] bits=new int[]{1, 1, 1, 0};
        System.out.println(seventeen.isOneBitCharacter(bits));
    }
}

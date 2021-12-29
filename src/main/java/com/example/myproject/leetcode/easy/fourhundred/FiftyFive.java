package com.example.myproject.leetcode.easy.fourhundred;

import java.util.Arrays;

/**
 * 455.分发饼干
 * 贪心算法,没解决,再看
 * 首先对数组 gg 和 ss 排序，然后从小到大遍历 gg 中的每个元素，对于每个元素找到能满足该元素的 ss 中的最小的元素。
 * 具体而言，令 ii 是 gg 的下标，jj 是 ss 的下标，初始时 ii 和 jj 都为 00，进行如下操作。
 *
 * 对于每个元素 g[i]g[i]，找到未被使用的最小的 jj 使得 g[i] \le s[j]g[i]≤s[j]，则 s[j]s[j] 可以满足 g[i]g[i]。
 * 由于 gg 和 ss 已经排好序，因此整个过程只需要对数组 gg 和 ss 各遍历一次。
 * 当两个数组之一遍历结束时，说明所有的孩子都被分配到了饼干，
 * 或者所有的饼干都已经被分配或被尝试分配（可能有些饼干无法分配给任何孩子），此时被分配到饼干的孩子数量即为可以满足的最多数量。
 *
 */
public class FiftyFive {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int numOfChildren = g.length, numOfCookies = s.length;
        int count = 0;
        for (int i = 0, j = 0; i < numOfChildren && j < numOfCookies; i++, j++) {
            while (j < numOfCookies && g[i] > s[j]) {
                j++;
            }
            if (j < numOfCookies) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FiftyFive fiftyFive=new FiftyFive();
        int[] g=new int[]{1,2,3};
        int[] s=new int[]{1,1};
        System.out.println(fiftyFive.findContentChildren(g,s));
    }
}

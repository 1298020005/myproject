package com.example.myproject.leetcode.easy.eighthundred;

/**
 * 836.矩形重叠
 * 要再看 方法二涉及iou 此法为法一 逆向思维
 */
public class ThirtySix {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        //逆向分析法  我们讨论为0在什么情况下
        //情况以 两个矩形 至少有个一个面积为0,则一定没有重叠
        if (rec1[0] == rec1[2] || rec1[1] == rec1[3] || rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
            return false;
        }
        // 其在 左侧 右侧 ~ ~ 满足一个即为 false
        return !(rec1[2] <= rec2[0] ||   // left
                rec1[3] <= rec2[1] ||   // bottom
                rec1[0] >= rec2[2] ||   // right
                rec1[1] >= rec2[3]);    // top
    }

    public static void main(String[] args) {
        ThirtySix thirtySix = new ThirtySix();
        int[] rec1 = new int[]{0, 0, 2, 2};
        int[] rec2 = new int[]{1, 1, 3, 3};
        System.out.println(thirtySix.isRectangleOverlap(rec1,rec2));
    }
}

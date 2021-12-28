package com.example.myproject.leetcode.easy.twohundred;

/**
 * 278.第一个错误版本
 * 二分查找法 典范
 * 将左右边界分别初始化为 11 和 nn，其中 nn 是给定的版本数量。设定左右边界之后，
 * 每次我们都依据左右边界找到其中间的版本，检查其是否为正确版本。如果该版本为正确版本，
 * 那么第一个错误的版本必然位于该版本的右侧，我们缩紧左边界；否则第一个错误的版本必然位于该版本及该版本的左侧，我们缩紧右边界。
 * 这样我们每判断一次都可以缩紧一次边界，而每次缩紧时两边界距离将变为原来的一半，
 * 因此我们至多只需要缩紧 O(\log n)O(logn) 次。
 */
public class SeventyEight {
    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) { // 循环直至区间左右端点相同
            int mid = left + (right - left) / 2; // 防止计算时溢出
            if (isBadVersion(mid)) {
                right = mid; // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1; // 答案在区间 [mid+1, right] 中
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }

    // isBadVersion为判断版本号 version 是否在单元测试中出错。leetcode中使用，此处为模拟
    private boolean isBadVersion(int mid) {
        return false;
    }
}

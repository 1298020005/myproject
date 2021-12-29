package com.example.myproject.leetcode.easy.fourhundred;

import java.util.ArrayList;
import java.util.List;

/**
 * 448.找到所有数组中消失的数字
 * 我的想法是用哈希表但是空间复杂度比较高
 * 官方题解为用数组代替哈希表
 * 再看
 */
public class FourtyEight {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //用nums 数组中出现的数 作为 统计 比如 7 他应该在新生成数组的的第 6位
        // 所以在nums[6] 的数字加上了 8 代表他在第7位出现过其实相当于节省了 一个数组的空间
        int n = nums.length;
        //eg:[4,3,2,7,8,2,3,1]在第一个for循环结束后是[12,19,18,15,8,2,11,9] n=8  注意这里的所有数字都加了个8
        for (int num : nums) {
            int x = (num - 1) % n; //得到num值对应的下标
            nums[x] += n;   //num-1下标位置的数+n放入nums数组中
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                //因为值是[1,n]而第一个for循环经过if判断后筛选得到
                //的是有问题的下标即从0开始但值从1，所以下面用i+1
                ret.add(i + 1);//i位置上的值i+1未曾出现过
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        FourtyEight fourtyEight=new FourtyEight();
        int[] nums=new int[]{4,3,2,7,8,2,3,1};
        fourtyEight.findDisappearedNumbers(nums);
    }
}

package com.example.myproject.leetcode.easy.eighthundred;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 896.单调数列
 * 建议再看 官方写法第二种很不错
 * 代码时空复杂度都很烂,但是我想用一下这个流的写法
 * 思想上用 正序倒序分别排列
 */
public class NinetySix {
    public boolean isMonotonic(int[] nums) {
        // 注意如果不是 clone 直接赋值,会导致 排序后原数组nums也跟着排序了
        int[] temp=nums.clone();
        Arrays.sort(temp);
        // 转换 int[] 转 Integer[]
        Integer[] reverse=Arrays.stream(temp).boxed().toArray(Integer[]::new);;
        List<Integer> list = Arrays.asList(reverse);
        Collections.reverse(list);
        boolean bool = false;
        // 转换  Integer[] 为 int[]
        int[] arr1 = list.stream().mapToInt(Integer::valueOf).toArray();
        if (Arrays.equals(temp,nums)||Arrays.equals(nums,arr1)){
            bool=true;
        }
        return  bool;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{5,4,3,2,1};
        NinetySix ninetySix=new NinetySix();
        System.out.println(ninetySix.isMonotonic(nums));
    }
}

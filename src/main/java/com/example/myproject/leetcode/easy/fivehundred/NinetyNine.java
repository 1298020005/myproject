package com.example.myproject.leetcode.easy.fivehundred;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 599.两个列表的最小索引
 * 用一个hash表存储 另个一个匹配
 *
 */
public class NinetyNine {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> temp=new HashMap<>();
        int flag=list2.length+list1.length;
        ArrayList<String> r=new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            temp.put(list1[i],i);
        }
        for (int j = 0; j < list2.length; j++) {
            if (temp.containsKey(list2[j])){
                int num=temp.get(list2[j])+j;
                if(flag>num){
                    flag=num;
                    r.clear();
                    r.add(list2[j]);
                } else if(num==flag){
                    r.add(list2[j]);
                }
            }
        }
        return r.toArray(new String[r.size()]);
    }

    public static void main(String[] args) {
        NinetyNine ninetyNine=new NinetyNine();
        String[] list1=new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2=new String[]{"KFC","Shogun","Burger King"};
        for (String s:ninetyNine.findRestaurant(list1,list2)){
            System.out.println(s);
        }
    }
}

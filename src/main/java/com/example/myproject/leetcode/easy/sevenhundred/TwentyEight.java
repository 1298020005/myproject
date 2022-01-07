package com.example.myproject.leetcode.easy.sevenhundred;

import java.util.ArrayList;
import java.util.List;

public class TwentyEight {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res=new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(selfDividing(i)){
                res.add(i);
            }
        }
        return res;
    }

    public boolean selfDividing(int n) {
        int temp = n, total = n;
        while (n != 0) {
            temp=n%10;
             if (temp==0||total%temp!=0){
                 return false;
             }
             n/=10;
        }
        return  true;
    }

    public static void main(String[] args) {
        TwentyEight twentyEight = new TwentyEight();
        for (Integer i : twentyEight.selfDividingNumbers(1, 22)) {
            System.out.println(i);
        }
    }
}

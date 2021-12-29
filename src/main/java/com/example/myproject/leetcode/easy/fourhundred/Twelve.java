package com.example.myproject.leetcode.easy.fourhundred;

import java.util.ArrayList;
import java.util.List;

/**
 * 412.Fizz Buzz
 */
public class Twelve {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            //注意if else 的先后顺序也很重要
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Twelve twelve = new Twelve();
        System.out.println(twelve.fizzBuzz(45));
    }
}

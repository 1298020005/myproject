package com.example.myproject.leetcode.easy.ninehundred;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 933.最近请求的次数
 * 队列用法,可以再看
 */
public class ThirtyThree {

    Queue<Integer> q;
    public ThirtyThree() {
        q = new LinkedList();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000)
            q.poll();
        return q.size();
    }
}

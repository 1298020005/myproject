package com.example.myproject.leetcode.easy.onehundred;

import com.example.myproject.leetcode.utils.ListNode;

import java.util.HashSet;

/**
 * 141.环形链表
 * 用hashset,比较简单。
 */
public class FourtyOne {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> repeat = new HashSet<>();
        while (head != null) {
            if (!repeat.add(head)) {
                return true;
            }
            head=head.next;
        }
        return false;
    }

    public static void main(String[] args) {
//        FourtyOne fourtyOne =new FourtyOne();
//        System.out.println(fourtyOne.hasCycle());
    }
}

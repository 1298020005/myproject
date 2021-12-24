package com.example.myproject.leetcode.easy;

import com.example.myproject.leetcode.utils.ListNode;

import java.lang.reflect.Array;
import java.util.List;

/**
 * 合并两个有序链表
 * 思路 这个题就是每次都把最小值压，最后的连接，当然是小的连小的，所以l1 小，就连到 l1,l2 小就连到 l2，最后先返回的，就是最小的头结点。
 * 建议在看
 */
public class TwentyOne {



    private ListNode result;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            //返回给小的val，传入比较后需要传入的值
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        } else {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
    }

    public static void main(String[] args) {
        ListNode list1;
        TwentyOne twentyOne = new TwentyOne();
    }
}

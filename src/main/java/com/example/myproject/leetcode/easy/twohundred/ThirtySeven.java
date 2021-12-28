package com.example.myproject.leetcode.easy.twohundred;

import com.example.myproject.leetcode.utils.ListNode;

/**
 * 237.删除链表中的结点
 */
public class ThirtySeven {
    // 把下一个结点 赋值给要删除结点 然后删除下一个结点 比如我要删除2 结点
    //①1->2->3->4 ②1->2->2->4 ②1->2->4
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

    }
}

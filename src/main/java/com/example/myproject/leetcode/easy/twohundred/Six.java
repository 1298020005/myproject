package com.example.myproject.leetcode.easy.twohundred;

import com.example.myproject.leetcode.utils.ListNode;

/**
 * 206.反转链表
 */
public class Six {
    public ListNode reverseList(ListNode head) {
        ListNode root = new ListNode();
        // 逻辑头结点点的下一个结点为空
        root.next = null;
        // 用于记录要处理的下一个结点
        ListNode next = null;
        //定义一个新的root节点作为新链表的头，然后定义一个next记录当前节点的next域，然后遍历链表，next
        // 记录head的下一节点，头节点指向root的next节点，root的next节点执相头节点，然后再把头节点后移。
        while (head != null) {
            // 记录要处理的下一个结点  1 2 3 4 5
            next = head.next;
            // 当前结点的下一个结点指向逻辑头结点的下一个结点
            head.next = root.next;
            // 逻辑头结点的下一个结点指向当前处理的结点
            root.next = head;
            // 上面操作完成了一个结点的头插
            head = next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        Six six = new Six();

    }
}

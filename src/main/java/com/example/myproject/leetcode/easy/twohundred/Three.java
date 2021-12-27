package com.example.myproject.leetcode.easy.twohundred;

import com.example.myproject.leetcode.utils.ListNode;

/**
 * 203.移除链表元素
 *
 */
public class Three {
    public ListNode removeElements(ListNode head, int val) {
        //设置这个结点并指向next 的原因是，头结点如果是重复结点，没办法去重,比如[7,7,7,7],第一个去删除不了
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur=dummyHead;
        while (cur.next != null) {
            if(cur.next.val==val){
                //注意这里
                cur.next=cur.next.next;
                //此处不能写 cur=cur.next,否则 会每次都少去重一个。
            }else{
                cur=cur.next;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        Three three = new Three();

    }
}
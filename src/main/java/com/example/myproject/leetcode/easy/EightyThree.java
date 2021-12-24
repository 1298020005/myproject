package com.example.myproject.leetcode.easy;

import com.example.myproject.leetcode.utils.ListNode;
import javafx.scene.shape.CullFace;

/**
 * 删除排序链表中的重复元素
 */
public class EightyThree {
    public ListNode deleteDuplicates(ListNode head) {
        //注意此处的cul
        ListNode cur = head;
        while(cur != null && cur.next != null) {
            if(cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                // cur 的值一直在变化
                cur = cur.next;
            }
        }
        // 如果不传head 而传入 cur 的话 cur 的指向的对象 实际上已经在每一次循环中变化了
        return head;
    }

    public static void main(String[] args) {
        EightyThree eightyThree=new EightyThree();
//        eightyThree.deleteDuplicates();
    }
}

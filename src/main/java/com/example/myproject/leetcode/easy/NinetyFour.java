package com.example.myproject.leetcode.easy;

import com.example.myproject.leetcode.utils.ListNode;
import com.example.myproject.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * 对递归要有更深刻的体悟
 */
public class NinetyFour {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }

    public static void main(String[] args) {
        NinetyFour ninetyFour = new NinetyFour();
    }
}

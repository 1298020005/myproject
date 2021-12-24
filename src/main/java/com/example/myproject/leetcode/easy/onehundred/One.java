package com.example.myproject.leetcode.easy.onehundred;

import com.example.myproject.leetcode.utils.TreeNode;

/**
 * 100.相同的树
 */
public class One {
    boolean flag;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        isSame( p, q);
        return flag;
    }
    public boolean isSame(TreeNode p,TreeNode q){

        if (p.left==q.left){
            isSame(p.left,p.left);
        }else{
            flag= false;
        }
        if (p.val==q.val){
        }else{
            flag= false;
        }
        if (p.right==q.right){
            isSame(p.right,p.right);
        }else{
            flag= false;
        }
        return  flag;
    }
}

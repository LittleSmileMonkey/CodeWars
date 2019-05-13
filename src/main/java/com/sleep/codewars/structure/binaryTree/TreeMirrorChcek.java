package com.sleep.codewars.structure.binaryTree;

import com.sleep.codewars.structure.TreeNode;

/**
 * Created by Sleep on 2018/6/25.
 * <p>
 * E-mail: sleepym09@163.com
 */
class TreeMirrorChcek {

    //递归解法
    static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (right == null) {
            return false;
        } else if (left == null) {
            return false;
        } else {
            if (left.val != right.val) return false;

            return isMirror(left.right, right.left) && isMirror(left.left, right.right);
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left, root.right);
    }
}

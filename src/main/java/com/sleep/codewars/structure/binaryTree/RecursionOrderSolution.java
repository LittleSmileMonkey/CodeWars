package com.sleep.codewars.structure.binaryTree;

import com.sleep.codewars.structure.TreeNode;

/**
 * Created by Sleep on 2018/6/21.
 * <p>
 * E-mail: sleepym09@163.com
 */
class RecursionOrderSolution {
    /**
     * @param root 根节点
     * @return
     */
    public void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    /**
     * 中序遍历
     * @param root
     * @return
     */
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            preorderTraversal(root.left);
            System.out.print(root.val + " ");
            preorderTraversal(root.right);
        }
    }

    /**
     * 后序遍历
     * @param root
     * @return
     */
    public void postorderTraversal(TreeNode root) {
        if (root != null) {
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }
}

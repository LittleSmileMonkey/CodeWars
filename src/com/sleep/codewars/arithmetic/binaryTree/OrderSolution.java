package com.sleep.codewars.arithmetic.binaryTree;

import com.sleep.codewars.arithmetic.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Sleep on 2018/6/12.
 * <p>
 * E-mail: sleepym09@163.com
 * <p>
 * 二叉树遍历方法：前序、中序、后序遍历、层次遍历
 */
class OrderSolution {
    /**
     * 前序遍历 通过栈的特性(先进后出，替代递归遍历)
     *
     * @param root 根节点
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        while (!nodeStack.empty()){
            TreeNode nextNode = nodeStack.pop();
            result.add(nextNode.val);
            if(nextNode.right != null){
                nodeStack.push(nextNode.right);
            }
            if(nextNode.left != null){
                nodeStack.push(nextNode.left);
            }
        }
        return result;
    }

    /**
     * 中序遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        return result;
    }
}

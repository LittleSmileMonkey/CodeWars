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
 * 二叉树遍历方法：
 * 前序：考察到一个节点后，即刻输出该节点的值，并继续遍历其左右子树。(根左右)
 * 中序：考察到一个节点后，将其暂存，遍历完左子树后，再输出该节点的值，然后遍历右子树。(左根右)
 * 后序遍历：考察到一个节点后，将其暂存，遍历完左右子树后，再输出该节点的值。(左右根)
 * 无论哪种遍历，对节点的考察（不一定输出）顺序都是一样的。
 * 层次遍历
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
        while (!nodeStack.empty()) {
            TreeNode nextNode = nodeStack.pop();
            result.add(nextNode.val);
            if (nextNode.right != null) {
                nodeStack.push(nextNode.right);
            }
            if (nextNode.left != null) {
                nodeStack.push(nextNode.left);
            }
        }
        return result;
    }

    /**
     * 中序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode currentNode = root;
        while (currentNode != null || !nodeStack.empty()) {
            if (currentNode != null) {
                nodeStack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = nodeStack.pop();
                result.add(currentNode.val);
                currentNode = currentNode.right;
            }
        }
        return result;
    }

    /**
     * 后序遍历
     * 通过last != peek.right来判断当前节点的右边是否比遍历过
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode currentNode = root;
        TreeNode last = null;
        while (currentNode != null || !nodeStack.empty()) {
            if (currentNode != null) {
                nodeStack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode peek = nodeStack.peek();
                if (peek.right != null && last != peek.right) {
                    currentNode = peek.right;
                }else {
                    peek = nodeStack.pop();
                    result.add(peek.val);
                    last = peek;
                }
            }
        }
        return result;
    }

    /**
     * 层级遍历
     * @param root
     * @return
     */
    public List<Integer> levelOrder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        return result;
    }
}

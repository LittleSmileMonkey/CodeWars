package com.sleep.codewars.structure.binaryTree;

import com.sleep.codewars.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
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
     * 前序遍历的另一种写法
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal1(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode currentNode = root;
        while (currentNode != null || !nodeStack.empty()) {
            if (currentNode != null) {
                result.add(currentNode.val);
                nodeStack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = nodeStack.pop();
                currentNode = currentNode.right;
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
     *
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
                } else {
                    peek = nodeStack.pop();
                    result.add(peek.val);
                    last = peek;
                }
            }
        }
        return result;
    }

    /**
     * 层级遍历，利用linkedList双向链表特性，将元素按照层级遍历顺序依次存放/取出
     *
     * @param root
     * @return
     */
    public List<Integer> levelOrder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            result.add(node.val);
            if (node.left != null) {
                queue.addLast(node.left);
            }
            if (node.right != null) {
                queue.addLast(node.right);
            }
        }
        return result;
    }

    /**
     * 层级遍历，输出嵌套数组的形式
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder1(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        int parentSize = 1;
        int childSize = 0;
        ArrayList<Integer> childs = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            childs.add(node.val);
            if (node.left != null) {
                queue.addLast(node.left);
                childSize++;
            }
            if (node.right != null) {
                queue.addLast(node.right);
                childSize++;
            }
            parentSize--;
            if(parentSize == 0){
                parentSize = childSize;
                childSize = 0;
                result.add(childs);
                childs = new ArrayList<>();
            }
        }
        return result;
    }
}

package com.sleep.codewars.arithmetic.binaryTree;

import com.sleep.codewars.arithmetic.TreeNode;

import java.util.List;

/**
 * binaryTree 遍历方法测试
 *
 *                      6
 *                    ↙↘
 *                   2   8
 *                 ↙↘    ↘
 *                0   4     9
 *                ↘   ↘
 *                 1    5
 */
public class BinaryTreeTest {

    private static TreeNode rootNode = new TreeNode(6);

    static {
        TreeNode node1 =new TreeNode(1);
        TreeNode node5 =new TreeNode(5);
        TreeNode node0 =new TreeNode(0);
        TreeNode node4 =new TreeNode(4);
        TreeNode node9 =new TreeNode(9);
        TreeNode node2 =new TreeNode(2);
        TreeNode node8 =new TreeNode(8);

        rootNode.left = node2;
        rootNode.right = node8;
        node2.left = node0;
        node2.right = node4;
        node8.right = node9;
        node0.right = node1;
        node4.right = node5;
    }

    public static void main(String[] args) {
        OrderSolution orderSolution = new OrderSolution();
        List<Integer> integers = orderSolution.preorderTraversal(rootNode);
        System.out.println(integers);
    }
}

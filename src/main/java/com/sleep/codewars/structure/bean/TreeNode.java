package com.sleep.codewars.structure.bean;

/**
 * Created by Sleep on 2018/6/12.
 * <p>
 * E-mail: sleepym09@163.com
 * <p>
 * 二叉树节点对象
 */
public class TreeNode {
    /**
     * 当前节点数值
     */
    public int val;
    /**
     * 左节点
     */
    public TreeNode left;
    /**
     * 右节点
     */
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }
}

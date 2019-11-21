package com.sleep.codewars.arithmetic.day01;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * author：xingkong on 2019/11/19
 * e-mail：xingkong@changjinglu.net
 * 每个拨轮都有10个数字： '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' 。每个拨轮可以自由旋转：例如把 '9' 变为  '0'，'0' 变为 '9' 。
 * 每次旋转都只能旋转一个拨轮的一位数字。
 * 锁的初始数字为 '0000' ，一个代表四个拨轮的数字的字符串。
 * 列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。
 * 字符串 target 代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。
 * 链接：https://leetcode-cn.com/problems/open-the-lock
 */
class OpenLock {
    public int openLock(String[] deadends, String target) {
        //将deadends添加至set
        Set<String> dead = new HashSet();
        for (String d : deadends) dead.add(d);

        //队列，从0000开始搜索
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("0000");
        queue.offer(null);

        //已经遍历过的数据
        HashSet<String> seen = new HashSet<>();
        seen.add("0000");

        //搜索路径长度
        int depth = 0;
        while (!queue.isEmpty()) {
            String node = queue.poll();
            if (node == null) {
                //null标志一层路径遍历完
                depth++;
                if (queue.peek() != null) {
                    queue.offer(null);
                }
            } else if (target.equals(node)) {
                //匹配成功
                return depth;
            } else if (!dead.contains(node)) {
                //不在死亡数字列表中
                for (int i = 0; i < 4; i++) {
                    for (int d = -1; d <= 1; d += 2) {
                        //加减1
                        int posNum = ((node.charAt(i) - '0') + d + 10) % 10;
                        String nei = node.substring(0, i) + ("" + posNum) + node.substring(i + 1);
                        if (!seen.contains(nei)) {
                            seen.add(nei);
                            queue.offer(nei);
                        }
                    }
                }
            }
        }
        return -1;
    }
}

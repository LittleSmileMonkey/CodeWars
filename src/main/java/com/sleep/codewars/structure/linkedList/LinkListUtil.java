package com.sleep.codewars.structure.linkedList;

/**
 * author：xingkong on 2020/5/29
 * e-mail：xingkong@changjinglu.net
 */
class LinkListUtil {
    public static void printLinkList(SinglyListNode head) {
        SinglyListNode curr = head;
        StringBuffer buffer = new StringBuffer();
        buffer.append("start ");
        while (curr != null) {
            buffer.append("-> ").append(curr.val);
            curr = curr.next;
        }
        buffer.append(" -> end");
        System.out.println(buffer);
    }
}

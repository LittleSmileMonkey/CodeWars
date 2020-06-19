package com.sleep.codewars.structure.linkedList;

/**
 * author：xingkong on 2020/5/26
 * e-mail：xingkong@changjinglu.net
 */
class ReverseNode {
    public static void main(String[] args) {
        SinglyListNode head = generateSinglyList();
        LinkListUtil.printLinkList(head);
        SinglyListNode reverse = reverse(head);
        LinkListUtil.printLinkList(reverse);
    }

    private static SinglyListNode generateSinglyList() {
        SinglyListNode head = new SinglyListNode(1);
        head.next = new SinglyListNode(2);
        head.next.next = new SinglyListNode(3);
        return head;
    }

    private static SinglyListNode reverse(SinglyListNode head) {
        SinglyListNode prev = null;
        SinglyListNode curr = head;
        while (curr != null) {
            SinglyListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}

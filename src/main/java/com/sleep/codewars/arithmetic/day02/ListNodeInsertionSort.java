package com.sleep.codewars.arithmetic.day02;

import com.sleep.codewars.structure.linkedList.SinglyListNode;

/**
 * author：xingkong on 2020/3/15
 * e-mail：xingkong@changjinglu.net
 * LeetCode 147题，对单链表进行插入排序
 */
class ListNodeInsertionSort {
    public static void main(String[] args) {
        SinglyListNode head = new SinglyListNode(6);
        head.next = new SinglyListNode(7);
        head.next.next = new SinglyListNode(3);
        head.next.next.next = new SinglyListNode(56);
        head.next.next.next.next = new SinglyListNode(2);
        head.next.next.next.next.next = new SinglyListNode(345);
        head.next.next.next.next.next.next = new SinglyListNode(74);
        head.next.next.next.next.next.next.next = new SinglyListNode(56);
        SinglyListNode current = linkedInsertionSort(head);
        while (current != null){
            System.out.print(current.val +" ");
            current = current.next;
        }
        System.out.println("");
    }

    private static SinglyListNode linkedInsertionSort(SinglyListNode head) {
        if (head == null || head.next == null) return head;
        SinglyListNode h = new SinglyListNode(-1);
        h.next = head;

        SinglyListNode current = head;
        SinglyListNode prev = h;
        SinglyListNode next;

        while (current != null){
            next = current.next;
            if (next != null && current.val > next.val){
                while (prev.next != null && prev.next.val < next.val){
                    prev = prev.next;
                }
                SinglyListNode temp = prev.next;
                prev.next = next;
                current.next = next.next;
                next.next = temp;
                prev = h;
            }else {
                current = next;
            }
        }

        return h.next;
    }
}

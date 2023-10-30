package org.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedList9TaskTest {
    @Test
    public void test1() {
        ListNode listNode = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        assertEquals("4,5,1,9", listNode.toString());
    }
    @Test
    public void test2() {
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node9 = new ListNode(9);

        node4.next = node5;
        node5.next = node1;
        node1.next = node9;
        LinkedList9Task linkedList9Task = new LinkedList9Task();
        linkedList9Task.deleteNode(node5);
        assertEquals("4,1,9", node4.toString());
    }


}
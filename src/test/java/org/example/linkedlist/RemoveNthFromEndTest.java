package org.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthFromEndTest {

    @Test
    public void tes1() {
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node9 = new ListNode(9);
        ListNode node8 = new ListNode(8);

        node4.next = node5;
        node5.next = node1;
        node1.next = node9;
        node9.next = node8;

        RemoveNthFromEnd linkedList1Task = new RemoveNthFromEnd();
        linkedList1Task.removeNthFromEnd(node4, 2);
        assertEquals("4,5,1,8", node4.toString());
    }

    @Test
    public void tes2() {
        ListNode node4 = new ListNode(4);


        RemoveNthFromEnd linkedList1Task = new RemoveNthFromEnd();
        ListNode result = linkedList1Task.removeNthFromEnd(node4, 1);
        assertNull(result);
    }

    @Test
    public void tes3() {
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node4.next = node5;

        RemoveNthFromEnd linkedList1Task = new RemoveNthFromEnd();
        linkedList1Task.removeNthFromEnd(node4, 1);
        assertEquals("4", node4.toString());
    }

}
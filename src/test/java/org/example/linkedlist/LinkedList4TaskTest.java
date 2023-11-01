package org.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedList4TaskTest {

    @Test
    public void test1() {
        LinkedList4Task linkedList4Task = new LinkedList4Task();
        ListNode node1_1 = new ListNode(1);
        ListNode node1_2 = new ListNode(2);
        ListNode node1_4 = new ListNode(4);

        ListNode node2_1 = new ListNode(1);
        ListNode node2_3 = new ListNode(3);
        ListNode node2_4 = new ListNode(4);

        node1_1.next = node1_2;
        node1_2.next = node1_4;

        node2_1.next = node2_3;
        node2_3.next = node2_4;

        ListNode result = linkedList4Task.mergeTwoLists(node1_1, node2_1);
        assertEquals("1,1,2,3,4,4", result.toString());
    }

    @Test
    public void test2() {
        LinkedList4Task linkedList4Task = new LinkedList4Task();
        ListNode node1_1 = new ListNode(1);
        ListNode node1_2 = new ListNode(2);
        ListNode node1_4 = new ListNode(3);

        ListNode node2_1 = new ListNode(4);
        ListNode node2_3 = new ListNode(5);
        ListNode node2_4 = new ListNode(6);

        node1_1.next = node1_2;
        node1_2.next = node1_4;

        node2_1.next = node2_3;
        node2_3.next = node2_4;

        ListNode result = linkedList4Task.mergeTwoLists(node1_1, node2_1);
        assertEquals("1,2,3,4,5,6", result.toString());
    }

    @Test
    public void test3() {
        LinkedList4Task linkedList4Task = new LinkedList4Task();
        ListNode node1_1 = new ListNode(1);


        ListNode result = linkedList4Task.mergeTwoLists(node1_1, null);
        assertEquals("1", result.toString());
    }

    @Test
    public void test4() {
        LinkedList4Task linkedList4Task = new LinkedList4Task();
        ListNode node1_1 = new ListNode(-9);
        ListNode node1_2 = new ListNode(-7);
        ListNode node1_4 = new ListNode(-3);

        ListNode node2_1 = new ListNode(-7);
        ListNode node2_3 = new ListNode(-7);
        ListNode node2_4 = new ListNode(-6);

        node1_1.next = node1_2;
        node1_2.next = node1_4;

        node2_1.next = node2_3;
        node2_3.next = node2_4;

        ListNode result = linkedList4Task.mergeTwoLists(node1_1, node2_1);
        assertEquals("-9,-7,-7,-7,-6,-3", result.toString());
    }

}
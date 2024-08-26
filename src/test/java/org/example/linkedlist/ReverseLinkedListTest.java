package org.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    public void test1() {
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node9 = new ListNode(9);
        ListNode node8 = new ListNode(8);
        ListNode node7 = new ListNode(7);

        node4.next = node5;
        node5.next = node1;
        node1.next = node9;
        node9.next = node8;
        node8.next = node7;
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverseList1(node4);
        assertEquals("7,8,9,1,5,4", node4.toString());
    }

    @Test
    public void test2() {
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node9 = new ListNode(9);
        ListNode node8 = new ListNode(8);

        node4.next = node5;
        node5.next = node1;
        node1.next = node9;
        node9.next = node8;
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.reverseList1(node4);
        assertEquals("8,9,1,5,4", node4.toString());
    }

    @Test
    public void test3() {
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node9 = new ListNode(9);
        ListNode node8 = new ListNode(8);
        ListNode node7 = new ListNode(7);

        node4.next = node5;
        node5.next = node1;
        node1.next = node9;
        node9.next = node8;
        node8.next = node7;
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode result = reverseLinkedList.reverseList3(node4);
        assertEquals("7,8,9,1,5,4", result.toString());
    }

    @Test
    public void test4() {
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node9 = new ListNode(9);
        ListNode node8 = new ListNode(8);

        node4.next = node5;
        node5.next = node1;
        node1.next = node9;
        node9.next = node8;
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode result = reverseLinkedList.reverseList3(node4);
        assertEquals("8,9,1,5,4", result.toString());
    }

}
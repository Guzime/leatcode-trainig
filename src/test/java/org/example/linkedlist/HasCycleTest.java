package org.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasCycleTest {

    @Test
    public void test1() {
        HasCycle hasCycle = new HasCycle();

        ListNode node1_1 = new ListNode(3);
        ListNode node1_2 = new ListNode(2);
        ListNode node1_3 = new ListNode(0);
        ListNode node1_4 = new ListNode(-4);

        node1_1.next = node1_2;
        node1_2.next = node1_3;
        node1_3.next = node1_4;
        node1_4.next = node1_2;

        assertTrue(hasCycle.hasCycle(node1_1));
    }

}
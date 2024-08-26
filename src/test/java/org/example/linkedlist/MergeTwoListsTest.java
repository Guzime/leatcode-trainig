package org.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoListsTest {

    @Test
    public void test1() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
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

        ListNode result = mergeTwoLists.mergeTwoLists(node1_1, node2_1);
        assertEquals("1,1,2,3,4,4", result.toString());
    }

    @Test
    public void test2() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
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

        ListNode result = mergeTwoLists.mergeTwoLists(node1_1, node2_1);
        assertEquals("1,2,3,4,5,6", result.toString());
    }

    @Test
    public void test3() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode node1_1 = new ListNode(1);


        ListNode result = mergeTwoLists.mergeTwoLists(node1_1, null);
        assertEquals("1", result.toString());
    }

    @Test
    public void test4() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
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

        ListNode result = mergeTwoLists.mergeTwoLists(node1_1, node2_1);
        assertEquals("-9,-7,-7,-7,-6,-3", result.toString());
    }

    @Test
    public void test2_1() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode node1_1 = new ListNode(1);

        ListNode node1_2 = new ListNode(1);
        ListNode result = mergeTwoLists.mergeTwoLists(node1_1, node1_2);
        assertEquals("1,1", result.toString());
    }

    @Test
    public void test2_2() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode node1_1 = new ListNode(-9);
        ListNode node1_2 = new ListNode(-7);
        ListNode node1_4 = new ListNode(-3);
        ListNode node1_5 = new ListNode(-3);
        ListNode node1_6 = new ListNode(-1);
        ListNode node1_7 = new ListNode(2);
        ListNode node1_8 = new ListNode(3);

        ListNode node2_1 = new ListNode(-7);
        ListNode node2_3 = new ListNode(-7);
        ListNode node2_4 = new ListNode(-6);
        ListNode node2_5 = new ListNode(-6);
        ListNode node2_6 = new ListNode(-5);
        ListNode node2_7 = new ListNode(-3);
        ListNode node2_8 = new ListNode(2);
        ListNode node2_9 = new ListNode(4);

        node1_1.next = node1_2;
        node1_2.next = node1_4;
        node1_4.next = node1_5;
        node1_5.next = node1_6;
        node1_6.next = node1_7;
        node1_7.next = node1_8;

        node2_1.next = node2_3;
        node2_3.next = node2_4;
        node2_4.next = node2_5;
        node2_5.next = node2_6;
        node2_6.next = node2_7;
        node2_7.next = node2_8;
        node2_8.next = node2_9;

        ListNode result = mergeTwoLists.mergeTwoLists2(node1_1, node2_1);
        assertEquals("-9,-7,-7,-7,-6,-6,-5,-3,-3,-3,-1,2,2,3,4", result.toString());
    }

    @Test
    public void test2_3() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
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

        ListNode result = mergeTwoLists.mergeTwoLists2(node1_1, node2_1);
        assertEquals("1,1,2,3,4,4", result.toString());
    }

    @Test
    public void test2_4() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
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

        ListNode result = mergeTwoLists.mergeTwoLists2(node1_1, node2_1);
        assertEquals("1,2,3,4,5,6", result.toString());
    }

    @Test
    public void test2_5() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode node1_1 = new ListNode(1);


        ListNode result = mergeTwoLists.mergeTwoLists2(node1_1, null);
        assertEquals("1", result.toString());
    }

    @Test
    public void test2_6() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
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

        ListNode result = mergeTwoLists.mergeTwoLists2(node1_1, node2_1);
        assertEquals("-9,-7,-7,-7,-6,-3", result.toString());
    }

    @Test
    public void test2_7() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode node1_1 = new ListNode(1);

        ListNode node1_2 = new ListNode(1);
        ListNode result = mergeTwoLists.mergeTwoLists2(node1_1, node1_2);
        assertEquals("1,1", result.toString());
    }

    @Test
    public void test2_8() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode node1_1 = new ListNode(-6);
        ListNode node1_2 = new ListNode(-2);
        ListNode node1_4 = new ListNode(-1);
        ListNode node1_5 = new ListNode(0);
        ListNode node1_6 = new ListNode(3);
        ListNode node1_7 = new ListNode(6);
        ListNode node1_8 = new ListNode(7);
        ListNode node1_9 = new ListNode(9);

        ListNode node2_1 = new ListNode(-9);
        ListNode node2_3 = new ListNode(-7);
        ListNode node2_4 = new ListNode(-5);
        ListNode node2_5 = new ListNode(-5);
        ListNode node2_6 = new ListNode(-1);
        ListNode node2_7 = new ListNode(0);
        ListNode node2_8 = new ListNode(0);
        ListNode node2_9 = new ListNode(5);
        ListNode node2_10 = new ListNode(9);

        node1_1.next = node1_2;
        node1_2.next = node1_4;
        node1_4.next = node1_5;
        node1_5.next = node1_6;
        node1_6.next = node1_7;
        node1_7.next = node1_8;
        node1_8.next = node1_9;

        node2_1.next = node2_3;
        node2_3.next = node2_4;
        node2_4.next = node2_5;
        node2_5.next = node2_6;
        node2_6.next = node2_7;
        node2_7.next = node2_8;
        node2_8.next = node2_9;
        node2_9.next = node2_10;

        ListNode result = mergeTwoLists.mergeTwoLists2(node1_1, node2_1);
        assertEquals("-9,-7,-6,-5,-5,-2,-1,-1,0,0,0,3,5,6,7,9,9", result.toString());
    }

}
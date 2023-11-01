package org.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedList5TaskTest {

    @Test
    public void test1() {
        LinkedList5Task linkedList5Task = new LinkedList5Task();
        ListNode node1_1 = new ListNode(-9);
        ListNode node1_2 = new ListNode(-7);
        ListNode node1_4 = new ListNode(-3);
        ListNode node1_5 = new ListNode(-2);
        ListNode node1_6 = new ListNode(-3);
        ListNode node1_7 = new ListNode(-7);
        ListNode node1_8 = new ListNode(-9);


        node1_1.next = node1_2;
        node1_2.next = node1_4;
        node1_4.next = node1_5;
        node1_5.next = node1_6;
        node1_6.next = node1_7;
        node1_7.next = node1_8;

        boolean palindrome = linkedList5Task.isPalindrome(node1_1);

        assertTrue(palindrome);
    }

    @Test
    public void test2() {
        LinkedList5Task linkedList5Task = new LinkedList5Task();
        ListNode node1_1 = new ListNode(-9);
        ListNode node1_2 = new ListNode(-7);
        ListNode node1_4 = new ListNode(-3);
        ListNode node1_5 = new ListNode(-2);
        ListNode node1_6 = new ListNode(-3);
        ListNode node1_7 = new ListNode(-7);
        ListNode node1_8 = new ListNode(-9);


        node1_1.next = node1_2;
        node1_2.next = node1_4;
        node1_4.next = node1_5;
        node1_5.next = node1_6;
        node1_6.next = node1_7;
        node1_7.next = node1_8;

        boolean palindrome = linkedList5Task.isPalindrome2(node1_1);

        assertTrue(palindrome);
    }

    @Test
    public void test3() {
        LinkedList5Task linkedList5Task = new LinkedList5Task();
        ListNode node1_1 = new ListNode(-9);
        ListNode node1_2 = new ListNode(-7);

        node1_1.next = node1_2;

        boolean palindrome = linkedList5Task.isPalindrome2(node1_1);

        assertFalse(palindrome);
    }

    @Test
    public void test4() {
        LinkedList5Task linkedList5Task = new LinkedList5Task();
        ListNode node1_1 = new ListNode(-9);
        ListNode node1_2 = new ListNode(-7);
        ListNode node1_3 = new ListNode(-9);

        node1_1.next = node1_2;
        node1_2.next = node1_3;

        boolean palindrome = linkedList5Task.isPalindrome2(node1_1);

        assertTrue(palindrome);
    }

    @Test
    public void test5() {
        LinkedList5Task linkedList5Task = new LinkedList5Task();
        ListNode node1_1 = new ListNode(1);
        ListNode node1_2 = new ListNode(2);

        node1_1.next = node1_2;

        boolean palindrome = linkedList5Task.isPalindrome2(node1_1);

        assertFalse(palindrome);
    }

    @Test
    public void test6() {
        LinkedList5Task linkedList5Task = new LinkedList5Task();
        ListNode node1_1 = new ListNode(1);
        ListNode node1_2 = new ListNode(2);
        ListNode node1_3 = new ListNode(2);
        ListNode node1_4 = new ListNode(2);
        ListNode node1_5 = new ListNode(1);

        node1_1.next = node1_2;
        node1_2.next = node1_3;
        node1_3.next = node1_4;
        node1_4.next = node1_5;

        boolean palindrome = linkedList5Task.isPalindrome2(node1_1);

        assertTrue(palindrome);
    }

}
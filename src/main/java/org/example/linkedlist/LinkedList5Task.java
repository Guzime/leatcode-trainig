package org.example.linkedlist;

public class LinkedList5Task {

    /**
     *
     * Given the head of a singly linked list, return true if it is a palindrome or false otherwise
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        ListNode start = head;
        ListNode end = null;
        while (start != end) {
            for (ListNode buff = start; ; buff = buff.next) {
                if (buff.next == end ) {
                    if (buff == start) {
                        return true;
                    }
                    if (buff.val != start.val) {
                        return false;
                    }
                    end = buff;
                    break;
                }
            }
            start = start.next;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        ListNode start = head;
        int listLenght = 0;
        while (start != null) {
            start = start.next;
            listLenght++;
        }
        int lengthListNode = listLenght/2;
        int[] half = new int[lengthListNode];

        start = head;
        for (int i = 0; i < half.length; i++,start = start.next) {
            half[i] = start.val;
        }
        if (listLenght % 2 == 1 && listLenght > 2) {
            start = start.next;
        }
        for (int i = half.length - 1; i >= 0; i--,start = start.next) {
            if (half[i] != start.val) {
                return false;
            }
        }

        return true;
    }

}

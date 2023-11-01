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
}

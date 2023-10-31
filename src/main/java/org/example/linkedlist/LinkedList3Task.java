package org.example.linkedlist;

public class LinkedList3Task {
    /**
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode start = head;
        int valStart = head.val;
        int count = 0;
        for (ListNode buff = head; buff != null; buff = buff.next, count++) {
            if (buff.next == null) {
                int buffVal = buff.val;
                buff.val = valStart;
                head.val = buffVal;
            }
        }
        start = start.next;
        valStart = start.val;
        count-=2;
        int i = 0;
        for (ListNode buff = start; i < count; buff = buff.next, i++) {
            if (i + 1 == count) {
                int buffVal = buff.val;
                buff.val = valStart;
                start.val = buffVal;
            }
        }

        return head;
    }

    public ListNode reverseList1(ListNode head) {
        ListNode start = head;
        ListNode end = null;
        while (start != end) {
            for (ListNode buff = start; ; buff = buff.next) {
                if (buff.next == end ) {
                    if (buff == start) {
                        return head;
                    }
                    int buffVal = buff.val;
                    buff.val = start.val;
                    start.val = buffVal;
                    end = buff;
                    break;
                }
            }
            start = start.next;
        }
        return head;
    }

}

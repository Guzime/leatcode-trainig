package org.example.linkedlist;

public class LinkedList2Task {


    /**
     *
     *
     *
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            node = node.next;
            count++;
        }
        node = head;
        if (n == count) {
            return head.next;
        }
        int position = count - n;
        count = 0;
        if (n == 1) {
            ListNode nextNode = node.next;
            ListNode prevNode = node;
            while (true) {
                if (nextNode.next == null) {
                    prevNode.next = null;
                    return head;
                }
                nextNode = nextNode.next;
                prevNode = prevNode.next;
            }
        }

        while (count != position) {
            node = node.next;
            count++;
        }
        deleteNode(node);
        return head;
    }

    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        ListNode prevNode = node;

        while (nextNode != null) {
            int buff = nextNode.val;
            nextNode.val = prevNode.val;
            prevNode.val = buff;
            nextNode = nextNode.next;
            if (nextNode == null) {
                prevNode.next = null;
                return;
            }
            prevNode = prevNode.next;
        }
    }

}

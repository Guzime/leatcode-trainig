package org.example.linkedlist;


public class LinkedList9Task {

    /**
     *There is a singly-linked list head and we want to delete a node node in it.
     *
     * You are given the node to be deleted node. You will not be given access to the first node of head.
     *
     * All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
     *
     * Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
     *
     *
     */
    public void deleteNode(ListNode node) {
        int deleteVal = node.val;
        ListNode nextNode = node.next;
        while (nextNode.next != null) {
            nextNode.next.val = node.val;
            nextNode = nextNode.next;
        }
    }
}

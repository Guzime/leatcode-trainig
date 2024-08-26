package org.example.linkedlist;


public class DeleteNode {

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
    public void deleteNode2(ListNode node) {
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

    // leatcode как же все просто было)
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

package org.example.linkedlist;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    ListNode(int x, ListNode node) { val = x; next = node;}

    @Override
    public String toString() {
        int counter = 0;
        ListNode start = next;
        StringBuilder builder = new StringBuilder();
        builder.append(val).append(",");
        while (start != null && counter < 20) {
            builder.append(start.val).append(",");
            start = start.next;
            counter ++;
        }
        return builder.substring(0, builder.toString().length() - 1);
    }
}

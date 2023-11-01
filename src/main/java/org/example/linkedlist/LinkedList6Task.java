package org.example.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedList6Task {

    //slow :(
    public boolean hasCycle(ListNode head) {
        Set<Integer> hashCodeSet = new HashSet<>();
        while (head != null) {
            if (hashCodeSet.contains(head.hashCode())) {
                return true;
            } else {
                hashCodeSet.add(head.hashCode());
                head = head.next;
            }
        }
        return false;
    }
}

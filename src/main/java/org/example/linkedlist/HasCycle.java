package org.example.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {

    //slow :(
    public boolean hasCycle1(ListNode head) {
        Set<Integer> hashCodeSet = new HashSet<>();
        while (head != null) {
            if (hashCodeSet.add(head.hashCode())) {
                head = head.next;
            } else {
                return true;
            }
        }
        return false;
    }

    //leatcode
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}

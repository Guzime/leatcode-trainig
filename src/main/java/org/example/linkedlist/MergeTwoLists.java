package org.example.linkedlist;

public class MergeTwoLists {

    /**
     *
     * You are given the heads of two sorted linked lists list1 and list2.
     *
     * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
     *
     * Return the head of the merged linked list.
     *
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val == list2.val && list1.next == null && list2.next == null) {
            list2.next = list1;
            return list2;
        }

        ListNode left = list1;
        ListNode right = list2;
        while (left != null && right != null) {
            ListNode buff;
            if (left.val == right.val && left.next == null && right.next == null) {
                right.next = left;
                break;
            }
            if (left.val <= right.val) {
                buff = left.next;
                if (left.next == null || right.val < left.next.val) {
                    left.next = right;
                }
                left = buff;
            } else {
                buff = right.next;
                if (right.next == null || left.val < right.next.val) {
                    right.next = left;
                }
                right = buff;
            }
        }

        return list1.val <= list2.val ? list1 : list2;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val == list2.val && list1.next == null && list2.next == null) {
            list2.next = list1;
            return list2;
        }

        ListNode left = list1;
        ListNode right = list2;
        boolean isLeft = list1.val <= list2.val;
        while (left != null && right != null) {
            ListNode buff;
            if (left.val == right.val) {
                if (isLeft) {
                    buff = left.next;
                    left.next = right;
                    isLeft = false;
                    left = buff;
                } else {
                    buff = right.next;
                    right.next = left;
                    isLeft = true;
                    right = buff;
                }
                continue;
            }
            if (left.val < right.val) {
                buff = left.next;
                if (left.next == null || right.val < left.next.val) {
                    left.next = right;
                    isLeft = false;
                }
                left = buff;
            } else {
                buff = right.next;
                if (right.next == null || left.val < right.next.val) {
                    right.next = left;
                    isLeft = true;
                }
                right = buff;
            }

        }

        return list1.val <= list2.val ? list1 : list2;
    }
}

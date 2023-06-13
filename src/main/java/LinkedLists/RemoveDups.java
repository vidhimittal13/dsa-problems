package LinkedLists;

import CtCILibrary.CtCILibrary.LinkedListNode;

import java.util.HashSet;

public class RemoveDups {
    public static void removeDups(LinkedListNode head) {
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode previous = null;
        while (head != null) {
            if (set.contains(head)) {
                previous.next = head.next;
            } else {
                set.add(head.data);
                previous = head;
            }
            head = head.next;
        }
    }
}

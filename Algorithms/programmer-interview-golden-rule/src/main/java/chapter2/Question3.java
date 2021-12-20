package chapter2;

import top.zw.datastruct.listnode.ListNode;

public class Question3 {

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fast = head,slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == null) return null;
            if(fast == slow) break;
        }
        slow = head;
        while (slow != fast){
            if(fast == null || fast.next == null) return null;
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}

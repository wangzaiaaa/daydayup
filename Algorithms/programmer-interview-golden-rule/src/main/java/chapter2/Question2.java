package chapter2;

import top.zw.datastruct.listnode.ListNode;

public class Question2 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int diffLength = 0;
        ListNode l1 = headA, l2 = headB, longer = headA;
        while (l1 != null || l2 != null) {
            if (l1 == null || l2 == null) {
                diffLength++;
                longer = (l1 != null) ? headA : headB;
            }
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        ListNode shorter = (longer == headA) ? headB : headA;
        while (diffLength > 0){
            longer = longer.next;
            diffLength--;
        }
        while (longer != null && shorter != null){
            if (longer == shorter) return longer;
            longer = longer.next;
            shorter = shorter.next;
        }
        return null;
    }
}

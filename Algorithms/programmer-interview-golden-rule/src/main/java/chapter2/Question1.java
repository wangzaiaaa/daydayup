package chapter2;

import top.zw.datastruct.listnode.ListNode;

import java.util.List;

public class Question1 {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = reverseListNode(slow);
        while (head != null && middle != null) {

            if (head.val != middle.val) return false;
            head = head.next;
            middle = middle.next;
        }
        return true;
    }

    private ListNode reverseListNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null,cur = head,tmp;
        while (cur != null){
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }






}

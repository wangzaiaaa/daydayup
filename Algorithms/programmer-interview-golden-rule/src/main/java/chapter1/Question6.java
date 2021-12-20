package chapter1;

import top.zw.datastruct.listnode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Question6 {

    public ListNode removeDuplicateNodes(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode res = head,pre = res,cur = res.next;
        Set<Integer> set = new HashSet<>();
        set.add(res.val);
        while (cur != null){
            if (set.contains(cur.val)){
                pre.next = cur.next;
            }else{
                set.add(cur.val);
                pre = cur;
            }
            cur = pre.next;
        }
        return res;
    }


}

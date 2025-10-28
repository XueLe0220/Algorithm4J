package cn.xuele.leetcode.medium;

import cn.xuele.leetcode.common.ListNode;

/**
 * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * @author XueLe
 * @since 2025/10/28
 */
public class LC0142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head){

        if(head == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

            if(fast == slow){
                ListNode temp = head;
                while(temp != slow){
                    slow = slow.next;
                    temp = temp.next;
                }
                return temp;
            }
        }
        return null;
    }
}

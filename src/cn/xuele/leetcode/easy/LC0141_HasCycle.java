package cn.xuele.leetcode.easy;

import cn.xuele.leetcode.common.ListNode;

/**
 *
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * 如果链表中有某个节点,可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 如果链表中存在环,则返回 true 否则,返回 false.
 *
 * @author XueLe
 * @since 2025/10/26
 */
public class LC0141_HasCycle {

    //Floyd判圈算法
    public boolean hasCycle(ListNode head){

        if(head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

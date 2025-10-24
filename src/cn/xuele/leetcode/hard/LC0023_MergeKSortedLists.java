package cn.xuele.leetcode.hard;

import cn.xuele.leetcode.common.ListNode;
import cn.xuele.leetcode.easy.LC0021_MergeTwoSortedLists;

/**
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 *
 * @author XueLe
 * @since 2025/10/24
 */
public class LC0023_MergeKSortedLists {

    //法一：顺序合并，每次取一个链表与ans合并
    public ListNode mergeKSortedLists1(ListNode[] lists){
        ListNode ans = null;
        for (ListNode list : lists) {
            ans = new LC0021_MergeTwoSortedLists().mergeTwoLists(ans,list);
        }
        return ans;
    }
}

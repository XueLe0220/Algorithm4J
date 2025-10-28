package cn.xuele.leetcode.easy;


import cn.xuele.leetcode.common.ListNode;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * @author XueLe
 * @since 2025-10-22
 */
public class LC0021_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode prev = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 == null ? list2 : list1;

        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = build(new int[]{1, 2, 4});
        ListNode l2 = build(new int[]{1, 3, 4});
        ListNode merged = new LC0021_MergeTwoSortedLists().mergeTwoLists(l1,l2);
        printList(merged);
    }

    //工具方法： 根据数组创建链表
    private static ListNode build(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for (int val : arr) {
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return dummy.next;
    }
    //工具方法： 用于打印链表查看具体输出情况
    private static void printList(ListNode listNode){
        while(listNode != null){
            System.out.print(listNode.val+" ");
            listNode = listNode.next;
        }
    }
}


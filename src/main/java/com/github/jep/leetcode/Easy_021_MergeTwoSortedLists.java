package com.github.jep.leetcode;

/*
 * @author: enping.jep
 * @date: 2019/8/7
 * @create 2019-08-07 6:51 PM
 *
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.

    Example:

    Input: 1->2->4, 1->3->4
    Output: 1->1->2->3->4->4
 */
public class Easy_021_MergeTwoSortedLists {


  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(-1), curr = dummy;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        curr.next = l1;
        l1 = l1.next;
      } else {
        curr.next = l2;
        l2 = l2.next;
      }
      curr = curr.next;
    }
    curr.next = (l1 == null) ? l2 : l1;
    return dummy.next;
  }

  public static void main(String args[]) {
    ListNode listNode1 = new ListNode(1);
    listNode1.next = new ListNode(2);
    listNode1.next.next = new ListNode(4);

    ListNode listNode2 = new ListNode(1);
    listNode2.next = new ListNode(3);
    listNode2.next.next = new ListNode(4);
    ListNode.print(mergeTwoLists(listNode1, listNode2));


  }


}

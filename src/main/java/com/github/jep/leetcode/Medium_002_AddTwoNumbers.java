package com.github.jep.leetcode;
/*
 * @author: enping.jep
 * @date: 2019/8/1
 * @create 2019-08-01 4:04 PM

 You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order and each of their nodes contain a single digit.
 Add the two numbers and return it as a linked list.
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 Example:

  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
  Output: 7 -> 0 -> 8
  Explanation: 342 + 465 = 807.
 */
public class Medium_002_AddTwoNumbers {


  public static ListNode addTwoNumbers(ListNode node1, ListNode node2) {
    ListNode head = new ListNode(0);
    ListNode curr = head;
    int sum = 0;
    while (node1 != null || node2 != null) {
      if (node1 != null) {
        sum += node1.val;
        node1 = node1.next;
      }
      if (node2 != null) {
        sum += node2.val;
        node2 = node2.next;
      }
      curr.next = new ListNode(sum % 10);
      //进位
      sum = sum / 10;
      curr = curr.next;
    }
    //最后的sum如果为1，则还需要增加一位
    if (sum == 1) {
      curr.next = new ListNode(sum);
    }

    return head.next;
  }

  public static void main(String args[]) {
    ListNode listNode = addTwoNumbers(ListNode.createTestData("[2,4,3]"),
        ListNode.createTestData("[5,6,4]"));
    ListNode.print(listNode);

  }
}

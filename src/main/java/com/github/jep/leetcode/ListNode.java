package com.github.jep.leetcode;
/*
 * @author: enping.jep
 * @date: 2019/8/1
 * @create 2019-08-01 4:18 PM
 */
public class ListNode {

  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  public static ListNode createTestData(String data) {
    if (data.equals("[]")) {
      return null;
    }
    data = data.substring(1, data.length() - 1);
    String[] split = data.split(",");
    int len = split.length;
    ListNode[] listNode = new ListNode[len + 1];
    listNode[0] = new ListNode(Integer.valueOf(split[0]));
    for (int i = 1; i < len; i++) {
      listNode[i] = new ListNode(Integer.valueOf(split[i]));
      listNode[i - 1].next = listNode[i];
    }
    return listNode[0];
  }

  public static void print(ListNode listNode) {
    if (listNode == null) {
      System.out.println("null");
      return;
    }
    StringBuilder str = new StringBuilder("[" + String.valueOf(listNode.val));
    ListNode p = listNode.next;
    while (p != null) {
      str.append(",").append(String.valueOf(p.val));
      p = p.next;
    }
    System.out.println(str.append("]"));
  }

}

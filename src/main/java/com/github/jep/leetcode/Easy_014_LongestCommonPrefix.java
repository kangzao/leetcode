package com.github.jep.leetcode;

/*
 * @author: enping.jep
 * @date: 2019/8/6
 * @create 2019-08-06 3:22 PM
 *
 * Write a function to find the longest common prefix string amongst an array of strings.

   If there is no common prefix, return an empty string "".

   Example 1:

      Input: ["flower","flow","flight"]
      Output: "fl"
      Example 2:

      Input: ["dog","racecar","car"]
      Output: ""
      Explanation: There is no common prefix among the input strings.
      Note:

      All given inputs are in lowercase letters a-z.
 *
 *
 *
 */
public class Easy_014_LongestCommonPrefix {

  public static String longestCommonPrefix(String[] strs) {
    if (null == strs || strs.length == 0) {
      return "";
    }
    String pre = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(pre) != 0) {
        pre = pre.substring(0, pre.length() - 1);
        System.out.println("pre=" + pre);
      }
    }
    return pre;
  }

  public static void main(String args[]) {
    String[] array = {"flower", "", "flight"};
    System.out.println(longestCommonPrefix(array));
  }

}

package com.github.jep.leetcode;

/*
 * @author: enping.jep
 * @date: 2019/8/5
 * @create 2019-08-05 2:17 PM
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:

      Input: 123
      Output: 321
      Example 2:

      Input: -123
      Output: -321
      Example 3:

      Input: 120
      Output: 21

      Note:
        Assume we are dealing with an environment which could only store integers within
        the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
        assume that your function returns 0 when the reversed integer overflows.
 */
public class Easy_007_ReverseInteger {

  public static long reverseInteger(int n) {
    long result = 0;
    for (; n != 0; n /= 10) {
      System.out.println(n);
      result = result * 10 + n % 10;
    }

    if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
      return 0;
    }

    return result;
  }

  public static void main(String args[]) {
    System.out.println(reverseInteger(120));
//    System.out.println(reverseInteger(Integer.MIN_VALUE));
//    System.out.println(reverseInteger(Integer.MAX_VALUE));
  }

}

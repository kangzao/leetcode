package com.github.jep.leetcode;

/*
 * @author: enping.jep
 * @date: 2019/8/5
 * @create 2019-08-05 3:49 PM
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
      Example 1:
      Input: 121
      Output: true
      Example 2:

      Input: -121
      Output: false
      Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
      Example 3:

      Input: 10
      Output: false
      Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
      Follow up:

      Coud you solve it without converting the integer to a string?
 *
 */
public class Easy_009_PalindromeNumber {


  public static boolean isPalindrome(int x) {
    //如果是负数或者被十整除，则肯定不是回文
    if (x < 0 || (x != 0 && x % 10 == 0)) {
      return false;
    }
    int result = 0;
    int num = x;
    while (num != 0) {
      result = result * 10 + num % 10;
      num = num / 10;
    }
    System.out.println(result);
    return result == x;
  }


  public static void main(String args[]) {
    System.out.println(isPalindrome(120));
  }

}

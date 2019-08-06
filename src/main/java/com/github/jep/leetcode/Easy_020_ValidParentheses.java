package com.github.jep.leetcode;

/*
 * @author: enping.jep
 * @date: 2019/8/6
 * @create 2019-08-06 4:32 PM
 *

 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Note that an empty string is also considered valid.

    Example 1:

    Input: "()"
    Output: true
    Example 2:

    Input: "()[]{}"
    Output: true
    Example 3:

    Input: "(]"
    Output: false
    Example 4:

    Input: "([)]"
    Output: false
    Example 5:

    Input: "{[]}"
    Output: true
 */
public class Easy_020_ValidParentheses {

  public static boolean validParentheses(String str) {
    char[] chars = new char[str.length() + 1];
    int top = 1;
    for (char c : str.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        chars[top++] = c;
      } else if (c == ')' && chars[--top] != '(') {
        return false;
      } else if (c == ']' && chars[--top] != '[') {
        return false;
      } else if (c == '}' && chars[--top] != '{') {
        return false;
      }
    }
    return top == 1;


  }


  public static void main(String args[]) {
    System.out.println(validParentheses("()[]{}"));
    System.out.println(validParentheses("([)]"));
    System.out.println(validParentheses("(["));
    System.out.println(validParentheses("()"));
    System.out.println(validParentheses("{[]}"));


  }
}

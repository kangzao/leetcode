package com.github.jep.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * @author: enping.jep
 * @date: 2019/8/5
 * @create 2019-08-05 5:18 PM
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

      Symbol       Value
      I             1
      V             5
      X             10
      L             50
      C             100
      D             500
      M             1000
  For example, two is written as II in Roman numeral, just two one's added together.
  Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

  Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
  Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
  The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

    Example 1:
    Input: "III"
    Output: 3
    Example 2:

    Input: "IV"
    Output: 4
    Example 3:

    Input: "IX"
    Output: 9
    Example 4:

    Input: "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.
    Example 5:

    Input: "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class Easy_013_RomanToInteger {


  /**
   * 题意是罗马数字转整型数，范围从 1 到 3999，查看下百度百科的罗马数字介绍如下：
   *
   * 相同的数字连写，所表示的数等于这些数字相加得到的数，如 Ⅲ=3；
   *
   * 小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数，如 Ⅷ=8、Ⅻ=12；
   *
   * 小的数字（限于 Ⅰ、X 和 C）在大的数字的左边，所表示的数等于大数减小数得到的数，如 Ⅳ=4、Ⅸ=9
   */
  public static int romanToInt(String s) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int len = s.length();
    int sum = map.get(s.charAt(len - 1));
    for (int i = len - 2; i >= 0; --i) {
      if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
        sum -= map.get(s.charAt(i));
      } else {
        sum += map.get(s.charAt(i));
      }
    }
    return sum;
  }

  public static void main(String args[]) {
    System.out.println(romanToInt("MCMXCIV"));
  }

}

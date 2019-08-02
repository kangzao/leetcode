package com.github.jep.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author enping
 * @version 1.0
 * 2019/8/1 22:05:22
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class Medium_003_LongestSubstringWithoutRepeatingCharacters {


  public static int lengthOfLongestSubstring(String s) {
    int ret = 0;
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0, start = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.containsKey(c)) {
        System.out.println("start=" + start);
        start = Math.max(map.get(c) + 1, start);
      }
      ret = Math.max(ret, i - start + 1);
      map.put(c, i);

    }
    return ret;
  }

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
  }

}

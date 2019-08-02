package com.github.jep.leetcode;
import java.util.HashMap;
import java.util.Map;

/*
 * @author: enping.jep
 * @date: 2019/8/1
 * @create 2019-08-01 3:33 PM

   Given an array of integers, return indices of the two numbers such that they add up to a specific target.

   You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].

 *
 */
public class Easy_001_TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    if (nums == null || nums.length == 0) {
      return null;
    }
    for (int i = 0; i < nums.length; i++) {
      if (map.get(nums[i]) != null) {
        return new int[]{i, map.get(nums[i])};
      }
      //key是另外一个数字 i为当前的位置
      map.put(target - nums[i], i);
    }
    return null;

  }


  public static void main(String args[]) {
    int[] nums = {2, 7, 11, 15};
    int[] result = twoSum(nums, 9);
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }

}

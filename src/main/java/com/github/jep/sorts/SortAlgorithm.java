package com.github.jep.sorts;

/*
 * @author: enping.jep
 * @date: 2019/8/14
 * @create 2019-08-14 2:45 PM
 */
public interface SortAlgorithm {

  /**
   * @param unsort - an array should be sorted
   * @return a sorted array
   */
  <T extends Comparable<T>> T[] sort(T[] unsort);





}

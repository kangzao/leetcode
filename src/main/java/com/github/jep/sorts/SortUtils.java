package com.github.jep.sorts;

import java.util.Arrays;

/*
 * @author: enping.jep
 * @date: 2019/8/14
 * @create 2019-08-14 9:32 AM
 */
public class SortUtils {

  /**
   * Helper method for swapping places in array
   *
   * @param array The array which elements we want to swap
   * @param idx index of the first element
   * @param idy index of the second element
   */
  static <T> void swap(T[] array, int idx, int idy) {
    T swap = array[idx];
    array[idx] = array[idy];
    array[idy] = swap;
  }

  /**
   * This method checks if first element is less then the other element
   *
   * @return true if the first element is less then the second element
   */
  static <T extends Comparable<T>> boolean less(T u, T v) {
    return u.compareTo(v) < 0;
  }




  /**
   * Prints an array
   *
   * @param toPrint - the array  which should be printed
   */
  static void print(Object[] toPrint) {
    System.out.println(Arrays.toString(toPrint));
  }


}

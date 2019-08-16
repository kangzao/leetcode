package com.github.jep.sorts;


/*
 * @author: enping.jep
 * @date: 2019/8/14
 * @create 2019-08-14 7:07 PM
 * 简单选择排序
 */
public class SelectionSort implements SortAlgorithm {

  @Override
  public <T extends Comparable<T>> T[] sort(T[] unsort) {
    int length = unsort.length;
    for (int i = 0; i < length - 1; i++) {
      //每一趟循环比较时，min用于存放较小元素的数组下标，这样当前批次比较完毕最终存放的就是此趟内最小的元素的下标，避免每次遇到较小元素都要进行交换。
      int min = i;
      for (int j = i + 1; j < length; j++) {
        if (SortUtils.less(unsort[j], unsort[min])) {
          System.out.println("i=" + i + ",j=" + j);
          min = j;
        }
      }
      if (min != i) {
        SortUtils.swap(unsort, i, min);
      }
    }
    return unsort;
  }

  public static void main(String args[]) {
    Integer[] arr = {4, 23, 6, 78, 1, 54, 231, 9, 12};
    arr = new SelectionSort().sort(arr);
    SortUtils.print(arr);

  }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_analysis.design_project;

/**
 *
 * @author evren
 */
public class QuickSortHoare {
    public static void quickSortHoare(int[] array, int low, int high) {
  if (low < high) {
    int pivotIndex = hoarePartition(array, low, high);

    quickSortHoare(array, low, pivotIndex);
    quickSortHoare(array, pivotIndex + 1, high);
  }
}

public static int hoarePartition(int[] array, int low, int high) {
  // choose the middle
  int pivot = array[(low + high) / 2];

  int i = low - 1;
  int j = high + 1;
  while (true) {
    // move the left pointer
    do {
      i++;
    } while (array[i] < pivot);

    // move the right pointer
    
    do {
      j--;
    } while (array[j] > pivot);

    if (i >= j) {
      return j;
    }
    swap(array, i, j);
  }
}

public static void swap(int[] array, int i, int j) {
  int temp = array[i];
  array[i] = array[j];
  array[j] = temp;
}
}

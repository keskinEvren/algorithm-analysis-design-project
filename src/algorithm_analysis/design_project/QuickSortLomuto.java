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
public class QuickSortLomuto {

    public static void quickSortLomuto(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = lomutoPartition(array, low, high);

            quickSortLomuto(array, low, pivotIndex - 1);
            quickSortLomuto(array, pivotIndex + 1, high);

        }
    }

    public static int lomutoPartition(int[] array, int low, int high) {
        // choose the last element in the array as the pivot
        int pivot = array[high];
        int pivotIndex = low;

        for (int i = low; i < high; i++) {
            if (array[i] < pivot) {
                swap(array, i, pivotIndex);
                pivotIndex++;
            }
        }

        // move the pivot to the final position
        swap(array, high, pivotIndex);
        return pivotIndex;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

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
public class HeapSort {

    public static void heapSort(int[] array) {
        // Build heap
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        // Perform sort
        for (int i = array.length - 1; i >= 0; i--) {
            // Move the current max element to the end of the array
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);

        }
    }

    public static void heapify(int[] array, int heapSize, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        // If the left child is larger than the root, set largest to left
        if (left < heapSize && array[left] > array[largest]) {
            largest = left;
        }

        // If the right child is larger than the largest so far, set largest to right
        if (right < heapSize && array[right] > array[largest]) {
            largest = right;
        }

        // If the largest element is not the root, swap it with the root and heapify the reduced heap
        if (largest != index) {
            int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;
            heapify(array, heapSize, largest);
        }
    }

}

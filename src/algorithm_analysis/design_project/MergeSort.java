/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_analysis.design_project;

import java.util.Arrays;

/**
 *
 * @author evren
 */
public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            // Split array in half
            int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);

            // Sort  half
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted 
            merge(array, left, right);
            
        }
    }

    // Merge two arrays
    public static void merge(int[] result, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements at i and j
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
    }
}


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
public class SelectionSort {

    public static void sort(int[] array) {


        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
            
        }
    }

}

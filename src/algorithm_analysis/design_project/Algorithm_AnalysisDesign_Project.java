/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_analysis.design_project;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author evren
 */
public class Algorithm_AnalysisDesign_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] array = new int[10000000];
        /*
        // Random Array
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9) + 1;
        }
        */
        /*
        //Reverse order random array(Mergesort Worstcase)
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
         */
        /*
        //Worst Case Heapsort & Insertion Sort & Selection Sort
        int n = 1000000; // size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
         */
 
        //Heapsort & Selection Sort & Insertion Sort & Merge Sort Bestcase
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
       

        }
        Arrays.sort(array);
         
 /*
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }

        for (int i : reverseArray) {
            System.out.println(i);
        }
         */
        long startTime = System.currentTimeMillis();
        //QuickSortHoare.quickSortHoare(array, 0, array.length - 1);
        //QuickSortLomuto.quickSortLomuto(array, 0, 10000);
        HeapSort.heapSort(array);
        //SelectionSort.sort(array);
        //InsertionSort.sort(array);
        //MergeSort.mergeSort(array);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Estimated Time: " + estimatedTime + "ms");
    }

}

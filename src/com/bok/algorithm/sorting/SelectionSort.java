package com.bok.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array={8,-8, 20,-3,11,-9,2};
        selectionSort(array);
        System.out.println("");
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minimumPointerIndex=i;
            for (int unSortedPointer = i+1; unSortedPointer < array.length; unSortedPointer++) {
                if(array[unSortedPointer] < array[minimumPointerIndex]){
                    minimumPointerIndex=unSortedPointer;
                    System.out.printf("Minimum index updated to %d with value as %d\n",
                            minimumPointerIndex, array[minimumPointerIndex]);
                }
            }
            //swap
            int temp = array[minimumPointerIndex];
            array[minimumPointerIndex]= array[i];
            array[i]= temp;

            //print
            Arrays.stream(array).forEach(System.out::println);
        }

    }

}

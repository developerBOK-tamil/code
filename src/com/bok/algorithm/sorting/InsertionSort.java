package com.bok.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array={-1, 8,-10,7,-3,2};
        insertionSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void insertionSort(int[] array) {
        for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
            int sortedIndex=unsortedIndex-1;
            int temp= array[unsortedIndex];
            while(sortedIndex >=0 && array[sortedIndex] > temp){
                array[sortedIndex+1]= array[sortedIndex];
                sortedIndex--;
            }
            array[sortedIndex+1]=temp;

        }
    }
}

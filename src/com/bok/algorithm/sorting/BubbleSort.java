package com.bok.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {6,5,3,1,8,7,2,4};
        bubbleSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf(" %d Iteration \n", i+1);
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                    System.out.printf("swapping %d %d \n", array[j], array[j+1]);
                    Arrays.stream(array).forEach(System.out::print);
                    System.out.println("");
                }
            }
        }
    }
}

package com.hamidoudiallo96;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        int[] unsortedArray = {96, 97, 87, 29, 92, 19};
        System.out.println("Insertion Sort: " + Arrays.toString( insertionSort(unsortedArray)));
        System.out.println("Bubble Sort: " + Arrays.toString( bubbleSort(unsortedArray)));
        System.out.println("Selection Sort: " + Arrays.toString( selectionSort(unsortedArray)));
    }

    public static int[] insertionSort(int[] array){
        int temp, i, j, key;
        int range = array.length;
        for(i = 1; i<range; i++){
            key = array[i];
            j= i-1;
            while(j>=0 && key< array[j]){
                temp = array[j+1];
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array){
        int temp,range,i;
        range = array.length-1;
        for(i = 0; i<range; i++){
            for(int j = 0; j<range-i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        int temp, range, i, j, minValue;
        range = array.length;
        for (i = 0; i < range; i++) {
            minValue = i;
            for (j = i + 1; j < range; j++) {
                if (minValue > array[j]) {
                    minValue = j;
                }
            }
            temp = array[i];
            array[i] = array[minValue];
            array[minValue] = temp;
        }
        return array;
    }

}

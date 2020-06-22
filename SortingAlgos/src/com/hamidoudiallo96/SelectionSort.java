package com.hamidoudiallo96;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        int[] unsortedArray = {96, 97, 87, 29, 92, 19};
        System.out.println("Selection Sort: " + Arrays.toString(selectionSort(intArray)));
        System.out.println("Selection Sort: " + Arrays.toString(selectionSort(unsortedArray)));
    }

    public static int[] selectionSort(int[] array){
        int temp, i, minValue;
        int range = array.length;
        for(i = 0; i< range; i++){
            minValue = i;
            for(int j = i + 1; j<range; j++){
                if(array[j] < array[minValue]){
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

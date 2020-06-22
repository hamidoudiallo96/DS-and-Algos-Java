package com.hamidoudiallo96;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {96, 97, 87, 29, 92, 19};
        int [] intArray = {20,35,-15,7,55,1,22};
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSort(unsortedArray)));
        System.out.println("Bubble Sort1: " + Arrays.toString(bubbleSort1(intArray)));

    }

//    preferred way => for loop => less code.
    public static int[] bubbleSort(int[] array){
        int temp, i, j;
        int range = array.length-1;
        for(i=0; i<range; i++ ){
            for(j=0; j< range-i; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

//    using a while loop => longer.
    public static int[] bubbleSort1(int[] array){
        int temp, i;
        boolean swap = true;
        int range = array.length-1;
        while(swap){
            swap = false;
            for(i=0; i<range; i++){
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
                swap = true;
            }
            range --;
        }
        return array;
    }


















//  Bubble Sort => O(n^2) quadratic
//    public static int[] sort(int[] array){
//        int temp = 0;
//        int range = array.length-1;
//        boolean swap = true;
//        while(swap){
//            swap = false;
//            System.out.println("Array:  " + Arrays.toString(array));
//            for(int i = 0; i< range; i++){
//                if(array[i] > array[i + 1]){
//                    swap(array,i,i+1);
//                    swap = true;
//                }
//            }
//            range--;
//        }
//        return array;
//    }


//    public static int[]  bubbleSort(int[] array){
//        int temp, i, j;
//        int range = array.length-1;
//        for(i = 0; i<range; i++){
//            for(j=0; j<range-i; j++){
//                System.out.println("");
//                System.out.println("j: " + j);
//                System.out.println("");
//                System.out.println("range: " + (range-i));
//                if(array[j] > array[j+1]){
//                    System.out.println("Array:  " +  Arrays.toString(array));
//                    temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                }
//            }
//        }
//        return array;
//    }

//    public static void swap(int[] array, int i,  int j){
//        int temp = 0;
//        temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }
}

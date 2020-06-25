package com.hamidoudiallo96;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] unsorted = {20,35,-15,7,55,1,-22};
        quickSort(unsorted,0,unsorted.length);
    }

    public static void quickSort(int[] array, int start, int end){
        if(end-start < 2) return;
        int pivotIndex = partition(array,start,end);
        quickSort(array,start,pivotIndex);
        quickSort(array,pivotIndex+1,end);
        System.out.println(Arrays.toString(array));
    }

    private static int partition(int[] array, int start, int end){
       int pivot = array[start];
       int i = start;
       int j = end;

       while(i<j){
           while(i<j && array[--j] >= pivot );
           if(i<j) array[i] = array[j];

           while(i<j && array[++i] <= pivot);
           if(i<j) array[j] = array[i];
       }

       array[j] = pivot;
       return j;
    }
























//    public static void quickSort(int[]array, int start,int end){
//        if(end-start <2 ){
//            return;
//        }
//
//        int pivotIndex = partition(array,start,end);
//        quickSort(array,start,pivotIndex);
//        quickSort(array, pivotIndex+1,end);
//
//    }
//
//
//    public static int  partition(int[] array, int start, int end){
//        int pivot = array[start];
//        int i = start;
//        int j = end;
//        while(i<j){
////            checks to see if arrays to the right of pivot less
//            while(i<j && array[--j] >=pivot);
//            if(i<j){
//                array[i] = array[j];
//            }
//            while(i< j && array[++i] <= pivot);
//            if(i<j){
//                array[j] = array[i];
//            }
//        }
//        array[j] =  pivot;
//        return j;
//    }
}

package com.hamidoudiallo96;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] unsorted = {20,35,-15,7,55,1,-22,10,34,29};
        System.out.println("MergeSort: " + Arrays.toString(mergeSort(unsorted,0,unsorted.length)));
    }

    public static int[] mergeSort(int[] array, int start, int end){
        int mid = (end+start)/2;
        if(end-start < 2){
            return array;
        }
        mergeSort(array, start,mid);
        mergeSort(array, mid, end);

        int[] result = merge(array,start,mid,end);
        return result;
    }

    public static int[] merge(int[] array, int start, int mid, int end){
        if(array[mid-1] <= array[mid]){
            return array;
        }
        int[] tempArray = new int[end-start];
        int i = start;
        int j = mid;
        int tempIndex = 0;

        while(i<mid && j<end){
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("tempArray: " + Arrays.toString(tempArray) + "\n");
            tempArray[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array,i,array,start+tempIndex,mid-i);
        System.arraycopy(tempArray,0,array,start,tempIndex);
        return array;
    }




























//    public static int[] mergeSort(int[] array, int start, int end){
//        if(end-start < 2){
//            return array;
//        }
//        int mid = (start + end)/2;
//        mergeSort(array,start,mid);
//        mergeSort(array,mid,end);
////        merge method;
//
//        int[] result = merge(array,start,mid,end);
//
//        return result;
//    }
//
//    public static int[] merge(int[] array, int start, int mid, int end) {
//        if (array[mid - 1] <= array[mid]) {
//            return array;
//        }
//        int i = start;
//        int j = mid;
//        int tempIndex = 0;
//        int[] temp = new int[end - start];
//        while (i < mid && j < end) {
//            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
//        }
////        still confused
////      left  over
//        System.arraycopy(array, i, array, start+ tempIndex, mid - i);
////        copy over the sorted array to the array
//        System.arraycopy(temp, 0, array, start, tempIndex);
//        return array;
//    }


}

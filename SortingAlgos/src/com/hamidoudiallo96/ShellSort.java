package com.hamidoudiallo96;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] unsorted = {94,24,-22,0,7,55,-1};
        System.out.println("Shellsort: " + Arrays.toString(shellSort(unsorted)));
        System.out.println(factorial(5));

    }

    public static int[] shellSort(int[] array){
        for(int gap = array.length/2; gap>0; gap /=2){
            for(int i = gap; i<array.length; i++){
                int key = array[i];
                System.out.println(key + "\n");
                int j = i;
                while(j>=gap && key<array[j-gap]){
                    array[j] = array[j-gap];
                    j-=gap;
                }
                array[j] = key;
            }
        }
        return array;
    }

    public static int factorial(int number){
//        base case
        if(number == 0){
            return 1;
        }

//        recursive case
        return number*factorial(number-1);

    }
}

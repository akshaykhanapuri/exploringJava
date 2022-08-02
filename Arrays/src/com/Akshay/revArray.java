package com.Akshay;

import java.util.ArrayList;
import java.util.Arrays;

public class revArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        revArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swapEnhanced(int[] arr, int index1, int index2){
        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
    }

    static void revArr(int[] arr){
        int index1 = 0;
        int index2 = arr.length-1;
        while(index1 < index2){
            swapEnhanced(arr, index1, index2);
            index1++;
            index2--;
        }
    }
}

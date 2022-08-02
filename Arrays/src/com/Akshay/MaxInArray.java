package com.Akshay;

public class MaxInArray {
    public static void main(String[] args){
        int[] arr = {12,42,55,2,23};
        max(arr);

    }

    static void max(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

package com.Akshay;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysDemo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        int[] arr1 = {1,2,3,4,5};
        int[] arr2; // Declaration: Happens in compile time || Stack memory
        arr2 = new int[5]; // Initialization: Happens in runtime (Actual object is created in memory) || Heap memory
        // An integer array is initialized with 0s by default
        // A String array is initialized with null
        for(int i=0; i<5; i++){
            arr[i] = input.nextInt();
        }
        for(int j=0; j<5; j++){
            System.out.println(arr[j]);
        }
        for(int k : arr){
            System.out.println(k);
        }
        System.out.println(Arrays.toString(arr));
    }
}


package com.Akshay;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] arr2 = new int[3][];
        // In the above array initialization we can see that the no of columns in not specified.
        // This is because the individual arrays inside the main array can be of variable size
        // Example:

        int[][] arr3 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        // Array Input (fixed size)
        int[][] arr = new int[3][2];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
               arr[i][j] = input.nextInt();
            }
        }
        // Array Input (not fixed size)
        for(int i = 0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

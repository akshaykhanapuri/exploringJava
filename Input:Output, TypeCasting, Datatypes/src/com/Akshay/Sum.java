package com.Akshay;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int input1  = input.nextInt();
        System.out.print("Enter the 2nd1 number: ");
        int input2 = input.nextInt();
        int sum = input1 + input2;
        System.out.println("The Sum is = " + sum);
    }

}

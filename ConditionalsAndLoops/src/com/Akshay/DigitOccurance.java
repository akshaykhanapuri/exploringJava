package com.Akshay;
import java.util.Scanner;

public class DigitOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int digit = input.nextInt();
        int count = 0;
        while(number % 10 != 0){
            if(number % 10 == digit){
                count++;
            }
            number = number/10;
        }
        System.out.println(count);
    }
}

package com.Akshay;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        if(n == 0){
            System.out.println('0');
        }
        else if(n == 1){
            System.out.println('1');
        }
        else{
            for(int pos=2; pos<=n; pos++){
                sum = a + b;
                a = b;
                b = sum;
            }
            System.out.println(sum);
        }
    }
}

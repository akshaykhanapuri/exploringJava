package com.Akshay;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int revNum = 0;
        while(num % 10 != 0){
            revNum = revNum*10 + num%10;
            num = num/10;
        }
        System.out.print(revNum);
    }
}

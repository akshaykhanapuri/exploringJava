package com.Akshay;
import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        sum();
        int answer = sum2();
        System.out.println(answer);
        System.out.println(message());
        System.out.println(sum3(20,30));
        System.out.println(message2("Akshay"));
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1 + num2);
        return;
    }
    static int sum2(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        return num1 + num2;
    }

    static String message(){
        return "Hello World!";
    }

    static int sum3(int num1, int num2){
        return num1 + num2;
    }

    static String message2(String incomingMessage){
        return "Hello " + incomingMessage;
    }
}

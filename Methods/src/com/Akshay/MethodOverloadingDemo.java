package com.Akshay;

public class MethodOverloadingDemo {
    public static void main(String[] args){
        fun();
        fun(1,2);
        fun(1,2,3);
        fun(1,"Hello");
    }

    static void fun(){
        System.out.println("Hello Akshay!");
    }

    static void fun(int a, int b){
        System.out.println(a + " " +  b);
    }

    static void fun(int a, int b, int c){
        System.out.println(a + " " +  b + " " + c);
    }

    static void fun(int a, String b){
        System.out.println(a + " " +  b );
    }
}

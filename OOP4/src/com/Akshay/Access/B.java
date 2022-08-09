package com.Akshay.Access;

public class B extends A{
    int num;
    String name;
    int[] arr;

    char test;

    void testMethod(){
        System.out.println("B");
    }

    public B(int num, String name, int[] arr, char test){
        super(num, name, arr);
        this.test = test;
    }
}

package com.Akshay.AbstractDemo;

public class Child2 extends Parent{

    Child2(int age){
        super(age);
    }

    @Override
    void career(String name){
        System.out.println("I am going to be a "+ name);
    }



}

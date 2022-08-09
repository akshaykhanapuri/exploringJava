package com.Akshay.AbstractDemo;

public abstract class Parent {
    int age;

    Parent(int age){
        this.age = age;
    }

    public void normalMethod(){
        System.out.println("This is not an abstract method");
    }
    abstract void career(String name);
}

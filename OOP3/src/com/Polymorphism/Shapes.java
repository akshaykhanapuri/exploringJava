package com.Polymorphism;

// Runtime Polymorphism or Method overriding

public class Shapes {

//  If a method is declared as final, it cannot be overridden in child class
//    Final area(){
//        System.out.println("I am in shapes");
//    }

// Similarly if a class is declared as final, it cannot have child class

// Static methods also cannot be overridden.

    void area(){
        System.out.println("I am in shapes");
    }
}

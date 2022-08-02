package com.Akshay;
// Shadowing is a concept in Java where there is an overlapping of scopes.
public class Shadowing {
    static int x = 90; // This class variable will be shadowed by the variable initialized at line 7
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40; // This variable will shadow the class variable
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x); // Since this does not share the scope of main(), x will point to the original value
    }
}

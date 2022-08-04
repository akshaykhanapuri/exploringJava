package com.Polymorphism;

// Compiletime polymorphism or method overloading

public class Numbers {
    public int Sum(int a, int b, int c){
        return a + b + c;
    }

    public int Sum(int a, int b){
        return a + b;
    }

    public float Sum(float a, float b){
        return a + b;
    }

    public float Sum(float a, int b){
        return a + b;
    }

}

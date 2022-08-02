package com.Akshay;

import java.util.Arrays;

public class VariableLengthArgs {
    public static void main(String[] args) {
        test(1,2,3,4);
        test2(1,2,"Hello", "World!");
    }

    static void test(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void test2(int a, int b, String ...c){
        System.out.println(a + " " + b + " " + Arrays.toString(c));
    }
}

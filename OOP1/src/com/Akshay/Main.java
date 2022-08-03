package com.Akshay;

public class Main {
    public static void main(String[] args){

        Student Akshay = new Student();
        Akshay.rno = 727;
        Akshay.name = "Akshay";
        Akshay.marks = 90.0f;
        System.out.println(Akshay.rno);
        System.out.println(Akshay.name);
        System.out.println(Akshay.marks);



    }
}

class Student {
    int rno;
    String name;
    float marks;
}

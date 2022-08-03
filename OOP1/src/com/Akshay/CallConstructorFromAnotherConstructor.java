package com.Akshay;

public class CallConstructorFromAnotherConstructor {
    public static void main(String[] args){
        Student2 Akshay = new Student2();
        System.out.println( Akshay.marks + " " + Akshay.name + " " + Akshay.rollno);
    }
}

class Student2{

    int rollno;
    String name;
    float marks;

    Student2(){
        this(727, "default", 90);
    }

    Student2(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}
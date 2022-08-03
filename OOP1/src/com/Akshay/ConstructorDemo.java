package com.Akshay;

public class ConstructorDemo {
    public static void main(String[] args){
        Student1 Akshay = new Student1(727, 90.0f, "Akshay");
        Student1 Rahul = new Student1(728, 90.0f, "Rahul");
        Student1 defaultObj = new Student1();

        System.out.println( Akshay.marks + " " + Akshay.name + " " + Akshay.rollno);
        System.out.println( Rahul.marks + " " + Rahul.name + " " + Rahul.rollno);
        System.out.println( defaultObj.marks + " " + defaultObj.name + " " + defaultObj.rollno);

    }
}

class Student1{


    int rollno;
    float marks;
    String name;

    // Constructor overloading
    // JVM is smart enough to work without 'this' but it is required when the name of arguments of the class methods are same as that of the class variables

    Student1(){
        this.rollno = 0;
        this.marks = 0.0f;
        this.name = "default";
    }

    Student1(int rollno, float marks, String name){
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

}
package com.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    double weight = 0;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double w, double h){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box obj){
        this.l = obj.l;
        this.h = obj.h;
        this.w = obj.w;
    }

    public void information(){
        System.out.println("Running the box");
    }

}



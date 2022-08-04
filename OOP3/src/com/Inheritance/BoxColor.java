package com.Inheritance;

public class BoxColor extends BoxWeight{
    String color;

    BoxColor(){
        super();
        this.color = "No Colour";
    }

    BoxColor(double h, double l, double w, double weight, String color){
        super(h,l,w,weight);
        this.color = color;
    }

}

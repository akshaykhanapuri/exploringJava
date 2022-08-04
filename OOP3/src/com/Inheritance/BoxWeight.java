package com.Inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        super();
        this.weight = -1;
    }

    BoxWeight(double h, double l, double w, double weight){
        super(l,w,h);
        this.weight = weight;
        System.out.println(this.weight);
        System.out.println(super.weight);
    }

    BoxWeight(BoxWeight otherObj){
        super(otherObj); // This is similar to Box obj = new BoxWeight();
        this.weight =  otherObj.weight;
    }
}

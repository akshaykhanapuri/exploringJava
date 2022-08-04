package com.Inheritance;

public class BoxPrice extends BoxWeight{
        double cost;

        BoxPrice(){
            super();
            this.cost = -1;
        }

        BoxPrice(BoxPrice obj){
            super(obj);
            this.cost = obj.cost;
        }

        BoxPrice(double l, double h, double w, double weight, double cost){
            super(h,l,w,weight);
            this.cost = cost;
        }

}

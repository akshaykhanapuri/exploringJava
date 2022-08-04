package com.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(4);
        Box box2 = new Box(4,5,6);
        System.out.println(box.l + " " + box.w + " " + box.h);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(5,6,7,8);
        System.out.println(box3.l + " " + box3.w + " " + box3.h);
        System.out.println(box4.l + " " + box4.w + " " + box4.h);

        Box box5 = new BoxWeight(1,2,3,4);


    }
}

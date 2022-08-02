package com.Akshay;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] arg){
        ArrayList<Integer> list = new ArrayList<>(2);

        for(int i=0; i<5; i++){
            list.add(i);
        }
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.contains(4));



    }
}

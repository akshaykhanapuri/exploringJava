package com.Akshay.InterfaceDemo;

public class DiscBrakes implements Brake{

    @Override
    public void brake() {
        System.out.println("Disc Brake Engaged");
    }
}

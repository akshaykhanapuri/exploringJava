package com.Akshay.InterfaceDemo;

public class CdPlayer implements Media{

    @Override
    public void start() {
        System.out.println("CD Player Starts");
    }

    @Override
    public void stop() {
        System.out.println("CD Player Stops");
    }
}

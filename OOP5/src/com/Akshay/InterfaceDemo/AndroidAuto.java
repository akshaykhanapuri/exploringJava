package com.Akshay.InterfaceDemo;

public class AndroidAuto implements Media{

    @Override
    public void start() {
        System.out.println("AndroidAuto Starts");
    }

    @Override
    public void stop() {
        System.out.println("AndroidAuto Stops");
    }
}

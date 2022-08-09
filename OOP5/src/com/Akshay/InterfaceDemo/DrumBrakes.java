package com.Akshay.InterfaceDemo;

public class DrumBrakes implements Brake{
    @Override
    public void brake() {
        System.out.println("Drum Brakes Engaged");
    }
}

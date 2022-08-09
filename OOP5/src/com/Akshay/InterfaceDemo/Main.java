package com.Akshay.InterfaceDemo;

public class Main {
    public static void main(String[] args) {
        Car akshayCar = new Car();
        akshayCar.start();
        akshayCar.startMusic();
        akshayCar.engageBrake();
        akshayCar.stopMusic();
        akshayCar.stop();

        Engine eEngine = new ElectricEngine();

        akshayCar.upgradeEngine(eEngine);
        akshayCar.start();
    }
}

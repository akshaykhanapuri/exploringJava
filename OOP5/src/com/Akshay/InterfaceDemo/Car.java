package com.Akshay.InterfaceDemo;

public class Car{

    private Engine engine;
    private Media player;
    private Brake brakes;

    Car(){
        this.engine = new PowerEngine();
        this.player = new AndroidAuto();
        this.brakes = new DiscBrakes();
    }

    Car(Engine engine, Media player, Brake brakes){
        this.engine = engine;
        this.player = player;
        this.brakes = brakes;
    }
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void engageBrake(){
        brakes.brake();
    }

    public void upgradeEngine(Engine newEngine){
        this.engine = newEngine;
    }
}

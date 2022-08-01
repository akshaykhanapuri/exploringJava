package com.Akshay;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celcius ");
        float tempInCelcius = input.nextFloat();
        float tempInFahrenheit = (tempInCelcius * (9.0f/5.0f)) + 32;
        System.out.println("The temperature in Fahrenheit is: " + Float.toString(tempInFahrenheit));

    }
}

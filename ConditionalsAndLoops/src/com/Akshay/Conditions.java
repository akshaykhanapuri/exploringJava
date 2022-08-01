package com.Akshay;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        int salary = 2000;

        if(salary > 100){
            salary = salary + 200;
        }else{
            salary = salary + 500;
        }
        System.out.println(salary);

        if(salary > 5000){
            salary += 200;
        }else if(salary > 2000){
            salary += 500;
        }
        else{
            salary += 100;
        }
        System.out.println(salary);
    }
}

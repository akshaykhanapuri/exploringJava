package com.Akshay;
import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch(fruit){
            case "Apple":
                System.out.println("Red");
                break;
            case "Mango":
                System.out.println("Yellow");
                break;
            case "Grapes":
                System.out.println("Green");
                break;
            default:
                System.out.println("Enter Valid Fruit");
        }
    }
}

package com.Akshay;
import java.util.Scanner;


public class NewSwitchCaseSyntax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "Apple" -> System.out.println("Red");
            case "Mango" -> System.out.println("Yellow");
            case "Grapes" -> System.out.println("Green");
            default -> System.out.println("Enter Valid Fruit");
        }
    }
}

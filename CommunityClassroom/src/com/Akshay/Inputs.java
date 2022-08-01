package com.Akshay;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        System.out.print("Please enter your roll no");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your roll no is: " + rollno);
    }
}

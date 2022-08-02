package com.Akshay;
import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter = input.next().trim().charAt(0);
        if(letter >= 'a' && letter <= 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }
    }
}

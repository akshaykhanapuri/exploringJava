package com.Akshay;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] arr){
        Scanner input = new Scanner(System.in);
        String[] str = new String[4];
        for(int i = 0; i < 4; i++){
            str[i] = input.next();
        }
        for(String s:str){
            System.out.println(s);
        }
    }
}

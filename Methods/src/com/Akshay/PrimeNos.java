package com.Akshay;
import java.util.Scanner;

public class PrimeNos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        int iterator = 2;
        while(iterator*iterator <= n){
            if(n % iterator == 0){
                return false;
            }
            iterator++;
        }
        return true;
    }


}

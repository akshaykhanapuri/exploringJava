package com.Akshay;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrongEnhanced(153));

        // Print all 3 digit armstrong numbers:

        for(int iterator = 10; iterator < 1000; iterator++){
            if(isArmstrongEnhanced(iterator)){
                System.out.println(iterator);
            }
        }
    }
    static boolean isArmstrong(int n){
        int copy = n;
        int units = n%10;
        n = n/10;
        int tens = n%10;
        n = n/10;
        int hundreds = n;
        if(Math.pow(units,3) + Math.pow(tens,3) + Math.pow(hundreds,3) == copy){
            return true;
        }
        return false;
    }

    static boolean isArmstrongEnhanced(int n){
        int copy = n;
        int sum = 0;
        int rem = 0;
        while(n != 0){
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n/10;
        }
        if(sum == copy){
            return true;
        }
        return false;
    }
}

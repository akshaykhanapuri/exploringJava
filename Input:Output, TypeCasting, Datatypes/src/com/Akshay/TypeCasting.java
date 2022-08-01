package com.Akshay;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); // if you provide a float number as an input, this will throw an error because Float > int. The other way around works fine due to Java's internal type conversion
        System.out.println(num);

        // Type Casting
        // In case you want to force Type conversion, you will have to do something called as Type Casting. Example:
        int integerVal = (int)12.12f;
        System.out.println(integerVal);

        // Automatic Type promotion in Expressions:
        // Observe that in line 20, we are doing byte operations and it is exceeding 256 which is what the byte datatype can handle. So it should result in an error.
        // But Java is doing type promotion here as the LHS variable has been declared as an int. If you change it to byte, it will give an error.
        byte in1 = 50;
        byte in2 =  40;
        byte in3 = 2;
        int out1 = (50 * 40) + 2;
        System.out.println(out1);


    }
}

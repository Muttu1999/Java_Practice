package com.honnappa.Exception;

import com.honnappa.Custom.DivideByZeroException;

import java.util.Scanner;

public class DivedeByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numerator value");
        int numerator= scanner.nextInt();
        System.out.println("Please enter denominatpor");
        int denominator = scanner.nextInt();
        if (denominator==0){
            throw new DivideByZeroException("Denominator cant be zero");
        }
        int result= numerator/denominator;
        System.out.println(result);


    }
}

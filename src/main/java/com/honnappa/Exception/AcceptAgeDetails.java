package com.honnappa.Exception;

import com.honnappa.Custom.InvaidAgeEception;

import java.util.Scanner;

public class AcceptAgeDetails {
    public static void main(String[] args) throws InvaidAgeEception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = scanner.nextInt();
        if (age<0 || age>100){
            throw new InvaidAgeEception("Invalid age deatails please enter proper deatails. it should be within 0-100");
        }
        System.out.println("your age is"  +age);
    }
}

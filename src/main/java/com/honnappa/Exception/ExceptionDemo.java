package com.honnappa.Exception;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner= null;
        try {
             scanner = new Scanner(System.in);
            System.out.println( "Enter a number...");
            int numbe = scanner.nextInt();
            System.out.println(numbe);
        }catch (Exception exception){
            System.out.println("Please provide numerial in input foemat and try again");

        }
        finally {
            System.out.println("Finally block is being exceuted");
            if(scanner!=null){
                scanner.close();
            }
        }

    }
}

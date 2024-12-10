package com.honnappa.Custom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr =  new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(isr);
        System.out.println("please enter a value...");
            String input = bf.readLine();
        System.out.println("The use enterd value "  + input);

            }
}

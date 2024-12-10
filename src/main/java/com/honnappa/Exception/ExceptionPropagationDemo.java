package com.honnappa.Exception;

import java.io.FileNotFoundException;

public class ExceptionPropagationDemo {
    public static void main(String[] args) {

        method1();
        System.out.println("Main Method");
    }
    static void method1(){
        try{
            Method2();
        }catch (FileNotFoundException exc){
            System.out.println(exc.getMessage());
        }
    }
    static void Method2() throws FileNotFoundException{
        Method3();
    }
    static void Method3() throws FileNotFoundException{
        throw new FileNotFoundException("File not found.please check");

    }
}

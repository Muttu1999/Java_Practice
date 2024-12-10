package com.honnappa.Exception;

public class TryReturnTest1 {
    int m1() // Compile time error.
    {
        try {
            System.out.println("I am in try block");
            return 50;
        }
        catch(Exception e)
        {
            System.out.println("I am in catch block");
        }
        // Here, no return statement at the end of method.
        return 0;
    }
    public static void main(String[] args)
    {
        TryReturnTest1 ft = new TryReturnTest1();
        System.out.println(ft.m1());
    }
}
/*
In the preceding program, we did not return a value at the end of the method.
Therefore, we will get compile-time error:
        “This method must return a result of type int”. So, this is an invalid case.*/

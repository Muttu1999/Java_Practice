package com.honnappa.MultiThreading;

public class HelloThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from helloThread class" +
                "which implements Runnable");
    }
}

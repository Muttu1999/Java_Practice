package com.honnappa.InterFace;

public  abstract class BMW {

    void commonFunc(){
        System.out.println("Inside commonFunc method");
    }
    abstract void accelerate();

    abstract void breake();

    public static void main(String[] args) {
        System.out.println("Inside the main method");
    }
}

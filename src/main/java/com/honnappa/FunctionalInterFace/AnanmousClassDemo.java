package com.honnappa.FunctionalInterFace;

public class AnanmousClassDemo {
    public static void main(String[] args) {
        Hello hello = new Hello(){

            @Override
            public void sayHello() {
                System.out.println("Ananmys");
            }
        };
        process(hello);
        process(new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Ananums 1");

            }
        });
    }
    public static void process(Hello h){
        h.sayHello();
    }
}

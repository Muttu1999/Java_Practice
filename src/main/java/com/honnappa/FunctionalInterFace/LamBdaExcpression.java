package com.honnappa.FunctionalInterFace;

public class LamBdaExcpression {
    public static void main(String[] args) {
        Hello hello=()-> System.out.println("Hello");
        Hello hello1=()-> System.out.println("Hello world");

        process(hello);
        process(hello1);
        process(()-> System.out.println("Hi"));

        AirthmeticOperation addition= (a,b)->a+b;
        System.out.println(addition.operation(5,5));

        AirthmeticOperation subtraction = (a,b)->a-b;
        System.out.println(subtraction.operation(5,5));

        AirthmeticOperation product = (a,b)->a-b;
        System.out.println(product.operation(5,5));

        AirthmeticOperation dividion= (a,b)->a/b;
        System.out.println(dividion.operation(5,5));
    }
    public static void process(Hello h){
        h.sayHello();
    }
}

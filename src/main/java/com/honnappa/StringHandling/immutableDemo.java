package com.honnappa.StringHandling;

public class immutableDemo {

    public static void main(String[] args) {
         String s1 = "Hello";
         String s2= "World";


        System.out.println("Before Concate :" + "\ns1:" + s1 + "\ns2" +s2);

        s2 = s1.concat(s2);

        System.out.println("After Concat: " + "\ns1: " + s1 + "\ns2" +s2);
    }
}

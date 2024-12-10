package com.honnappa.FunctionalInterFace;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, String> converStr = input -> input.toUpperCase();
        System.out.println(converStr.apply("Honnappa Malakajappa kamatar"));//HONNAPPA MALAKAJAPPA KAMATAR


        Function<String, Integer> getStrLength = input -> input.length();
        System.out.println(getStrLength.apply("Honnappa"));//8

        Function<String, String> sameValue = Function.identity();
        System.out.println(sameValue.apply("Hi Honnappa"));//Hi Honnappa

        Function<Integer, Integer> doubleValue = num -> num * 2;
        Function<Integer, Integer> addaThree = num -> num + 3;

        Function<Integer, Integer> output1 = doubleValue.andThen(addaThree);//13
        Function<Integer, Integer> output2 = doubleValue.compose(addaThree);//16
        System.out.println(output1.apply(5));
        System.out.println(output2.apply(5));
    }
}

package com.honnappa.FunctionalInterFace;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunction {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isEven = (num1, num2)->(num1+num2)%2==0;
        System.out.println(isEven.test(4, 9));

        java.util.function.BiFunction<Double,Double,Double> calculatePower = (num1, num2)-> Math.pow(num1,num2);
        System.out.println(calculatePower.apply(2.0,3.0));

        BiConsumer<String, String> appendConvertert = (word1, word2)->
                System.out.println((word1+word2).toUpperCase());
        appendConvertert.accept("Hello ", "Honnappa");

        BiConsumer<String,String> appendConverLength = (word1,word2)->
                System.out.println((word1+word2).length());
        appendConverLength.accept("Hello","Honnappa");

        BinaryOperator<Double> calculatePowerWithBo = (num1, num2)->Math.pow(num1,num2);
                System.out.println(calculatePowerWithBo.apply(5.0,2.0));





    }
}

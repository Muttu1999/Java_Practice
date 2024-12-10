package com.honnappa.FunctionalInterFace;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate {
    public static void main(String[] args) {
        java.util.function.Predicate<Integer> isEven = num->num%2==0;
        System.out.println(isEven.test(16));
        System.out.println(isEven.test(13));


        java.util.function.Predicate<Integer> isGraterTh50 = num->num>50;
        System.out.println(isGraterTh50.test(61));
        System.out.println(isGraterTh50.test(13));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evenList = list.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenList);

        System.out.println(isEven.or(isGraterTh50).test(63));

        System.out.println(isEven.negate().test(63));

        java.util.function.Predicate<Integer> isOdd = java.util.function.Predicate.not(isEven);
        System.out.println(isOdd.test(4));


    }
}
